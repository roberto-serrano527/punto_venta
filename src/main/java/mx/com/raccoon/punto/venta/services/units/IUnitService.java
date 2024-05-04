package mx.com.raccoon.punto.venta.services.units;

import mx.com.raccoon.punto.venta.models.entities.Unit;

import java.util.List;

public interface IUnitService {

    List<Unit> findAll();
}
