package mx.com.raccoon.punto.venta.services;

import lombok.extern.slf4j.Slf4j;
import mx.com.raccoon.punto.venta.models.entities.product.Product;
import mx.com.raccoon.punto.venta.repositories.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@Slf4j
public class ProductService implements IProductService{

    IProductRepository repository;

    public ProductService(IProductRepository repository) {
        this.repository = repository;
    }

    public Map<String, String> guardarProducto(Product producto) {
        log.info("Ejecuntando guardarProducto()");
        Map<String, String> response = new HashMap<>();
        Product productRepository = repository.save(producto);
        response.put("id", String.valueOf(productRepository.getId()));
        response.put("code", String.valueOf(productRepository.getCode()));
        return response;
    }

    public Product busquedaPorCodigo(Long code) {
        Optional<Product> response = repository.findByCode(code);
        return response.orElseThrow();
    }
}
