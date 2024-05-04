package mx.com.raccoon.punto.venta.services.boxes;

import mx.com.raccoon.punto.venta.models.entities.Box;
import mx.com.raccoon.punto.venta.repositories.IBoxRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoxService implements IBoxService{

    private final IBoxRepository repository;

    public BoxService(IBoxRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Box> findAll() {
        return (List<Box>) repository.findAll();
    }
}
