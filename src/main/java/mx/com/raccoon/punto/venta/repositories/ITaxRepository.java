package mx.com.raccoon.punto.venta.repositories;

import mx.com.raccoon.punto.venta.models.entities.Tax;
import org.springframework.data.repository.CrudRepository;

public interface ITaxRepository extends CrudRepository<Tax, Long> {
}
