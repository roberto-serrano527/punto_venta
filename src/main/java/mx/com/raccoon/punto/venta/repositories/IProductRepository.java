package mx.com.raccoon.punto.venta.repositories;

import mx.com.raccoon.punto.venta.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IProductRepository extends CrudRepository<Product, Long> {

    Optional<Product> findByCode(Long code);
}
