package mx.com.raccoon.punto.venta.repositories;

import mx.com.raccoon.punto.venta.models.product.ProductIn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<ProductIn, Long> {
}
