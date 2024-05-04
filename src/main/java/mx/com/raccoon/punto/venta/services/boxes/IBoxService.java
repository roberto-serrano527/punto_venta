package mx.com.raccoon.punto.venta.services.boxes;

import mx.com.raccoon.punto.venta.models.entities.Box;

import java.util.List;

public interface IBoxService {

    List<Box> findAll();
}
