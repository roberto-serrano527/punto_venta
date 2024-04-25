package mx.com.raccoon.punto.venta.services;

import mx.com.raccoon.punto.venta.models.entities.product.Product;

import java.util.Map;

public interface IProductService {

    Map<String, String> guardarProducto(Product producto);

    Product busquedaPorCodigo(Long code);
}
