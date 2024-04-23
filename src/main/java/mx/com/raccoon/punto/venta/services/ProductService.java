package mx.com.raccoon.punto.venta.services;

import mx.com.raccoon.punto.venta.models.entities.product.Product;
import mx.com.raccoon.punto.venta.repositories.IProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{

    IProductRepository repository;

    public ProductService(IProductRepository repository) {
        this.repository = repository;
    }

    public void guardarProducto(Product producto) {
        repository.save(producto);
    }

    public Product busquedaPorCodigo(Long code) {
        return repository.findByCode(code).get();
    }
}
