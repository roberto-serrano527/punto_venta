package mx.com.raccoon.punto.venta.repositories;

import mx.com.raccoon.punto.venta.models.entities.Brand;
import org.springframework.data.repository.CrudRepository;

public interface IBrandRepository extends CrudRepository<Brand, Long> {
}
