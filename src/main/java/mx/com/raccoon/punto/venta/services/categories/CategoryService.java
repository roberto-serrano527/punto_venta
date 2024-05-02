package mx.com.raccoon.punto.venta.services.categories;

import mx.com.raccoon.punto.venta.models.entities.Category;
import mx.com.raccoon.punto.venta.repositories.categories.ICategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{

    private ICategoryRepository repository;

    public CategoryService(ICategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Category> findAll() {
        return (List<Category>) repository.findAll();
    }
}
