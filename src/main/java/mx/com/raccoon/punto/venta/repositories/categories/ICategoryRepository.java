package mx.com.raccoon.punto.venta.repositories.categories;

import mx.com.raccoon.punto.venta.models.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepository extends CrudRepository<Category, Long> {
}
