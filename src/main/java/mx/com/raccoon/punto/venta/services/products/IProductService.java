package mx.com.raccoon.punto.venta.services.products;

import mx.com.raccoon.punto.venta.models.ProductModel;
import mx.com.raccoon.punto.venta.models.entities.Product;

import java.util.Map;

public interface IProductService {

    Map<String, String> guardarProducto(ProductModel producto);

    Product busquedaPorCodigo(Long code);
}
