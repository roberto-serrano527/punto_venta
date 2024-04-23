package mx.com.raccoon.punto.venta.services;

import mx.com.raccoon.punto.venta.models.entities.product.Product;

public interface IProductService {

    void guardarProducto(Product producto);

    Product busquedaPorCodigo(Long code);
}
