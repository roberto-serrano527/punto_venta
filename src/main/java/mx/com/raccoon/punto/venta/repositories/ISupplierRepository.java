package mx.com.raccoon.punto.venta.repositories;

import mx.com.raccoon.punto.venta.models.entities.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface ISupplierRepository extends CrudRepository<Supplier, Long> {
}
