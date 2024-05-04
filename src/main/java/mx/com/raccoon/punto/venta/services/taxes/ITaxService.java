package mx.com.raccoon.punto.venta.services.taxes;

import mx.com.raccoon.punto.venta.models.entities.Tax;

import java.util.List;

public interface ITaxService {

    List<Tax> findAll();
}
