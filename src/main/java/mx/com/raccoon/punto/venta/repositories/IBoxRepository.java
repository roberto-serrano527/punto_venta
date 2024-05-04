package mx.com.raccoon.punto.venta.repositories;

import mx.com.raccoon.punto.venta.models.entities.Box;
import org.springframework.data.repository.CrudRepository;

public interface IBoxRepository extends CrudRepository<Box, Long> {
}
