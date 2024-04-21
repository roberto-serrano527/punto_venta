package mx.com.raccoon.punto.venta.services;

import mx.com.raccoon.punto.venta.models.product.ProductIn;
import mx.com.raccoon.punto.venta.repositories.IProductRepository;

public class ProductService implements IProductService{

    IProductRepository repository;

    public ProductService(IProductRepository repository) {
        this.repository = repository;
    }

    public void guardarProducto(ProductIn producto) {
        repository.save(producto);
    }
}
