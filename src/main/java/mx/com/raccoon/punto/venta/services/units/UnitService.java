package mx.com.raccoon.punto.venta.services.units;

import mx.com.raccoon.punto.venta.models.entities.Unit;
import mx.com.raccoon.punto.venta.repositories.IUnitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitService implements IUnitService{

    private final IUnitRepository repository;

    public UnitService(IUnitRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Unit> findAll() {
        return (List<Unit>) repository.findAll();
    }
}
