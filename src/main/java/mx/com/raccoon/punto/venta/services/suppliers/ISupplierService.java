package mx.com.raccoon.punto.venta.services.suppliers;

import mx.com.raccoon.punto.venta.models.entities.Supplier;

import java.util.List;

public interface ISupplierService {
    List<Supplier> findAll();

}
