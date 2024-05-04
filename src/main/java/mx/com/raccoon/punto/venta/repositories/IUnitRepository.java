package mx.com.raccoon.punto.venta.repositories;

import mx.com.raccoon.punto.venta.models.entities.Unit;
import org.springframework.data.repository.CrudRepository;

public interface IUnitRepository extends CrudRepository<Unit, Long> {
}
