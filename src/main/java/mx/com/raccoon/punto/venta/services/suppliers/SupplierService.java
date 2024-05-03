package mx.com.raccoon.punto.venta.services.suppliers;

import mx.com.raccoon.punto.venta.models.entities.Supplier;
import mx.com.raccoon.punto.venta.repositories.ISupplierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService implements ISupplierService{

    private final ISupplierRepository repository;

    public SupplierService(ISupplierRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Supplier> findAll() {
        return (List<Supplier>) repository.findAll();
    }
}
