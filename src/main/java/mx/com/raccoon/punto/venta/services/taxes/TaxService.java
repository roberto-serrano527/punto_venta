package mx.com.raccoon.punto.venta.services.taxes;

import mx.com.raccoon.punto.venta.models.entities.Tax;
import mx.com.raccoon.punto.venta.repositories.ITaxRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxService implements ITaxService{

    private final ITaxRepository repository;

    public TaxService(ITaxRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Tax> findAll() {
        return (List<Tax>) repository.findAll();
    }
}
