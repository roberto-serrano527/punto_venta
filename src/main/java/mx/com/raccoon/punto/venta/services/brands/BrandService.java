package mx.com.raccoon.punto.venta.services.brands;

import mx.com.raccoon.punto.venta.models.entities.Brand;
import mx.com.raccoon.punto.venta.repositories.IBrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService implements IBrandService{

    private final IBrandRepository repository;

    public BrandService(IBrandRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Brand> findAll() {
        return (List<Brand>) repository.findAll();
    }
}
