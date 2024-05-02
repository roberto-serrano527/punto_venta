package mx.com.raccoon.punto.venta.services.categories;

import mx.com.raccoon.punto.venta.models.entities.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();
}
