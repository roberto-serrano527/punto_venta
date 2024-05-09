package mx.com.raccoon.punto.venta.services.products;

import lombok.extern.slf4j.Slf4j;
import mx.com.raccoon.punto.venta.models.ProductModel;
import mx.com.raccoon.punto.venta.models.entities.*;
import mx.com.raccoon.punto.venta.repositories.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@Slf4j
public class ProductService implements IProductService {

    private final IProductRepository repository;

    public ProductService(IProductRepository repository) {
        this.repository = repository;
    }

    public Map<String, String> guardarProducto(ProductModel producto) {
        log.info("Ejecuntando guardarProducto()");
        Map<String, String> response = new HashMap<>();
        Product product = new Product(
                producto.getId(),
                producto.getEmployeeId(),
                producto.getProductType(),
                producto.getName(),
                producto.getCode(),
                new Category(producto.getCategoryId()),
                new Supplier(producto.getSupplierId()),
                new Brand(producto.getBrandId()),
                producto.getBarcodeType(),
                new Box(producto.getBoxId()),
                new Unit(producto.getUnitId()),
                producto.getPrice(),
                producto.getStockAlert(),
                producto.getDescription(),
                producto.isStatus(),
                producto.getPercentageTax(),
                producto.getMethodTax()
        );

        Product productRepository = repository.save(product);
        response.put("id", String.valueOf(productRepository.getId()));
        response.put("code", String.valueOf(productRepository.getCode()));
        return response;
    }

    public Product busquedaPorCodigo(Long code) {
        Optional<Product> response = repository.findByCode(code);
        return response.orElseThrow();
    }
}
