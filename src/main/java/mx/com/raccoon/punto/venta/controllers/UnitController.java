package mx.com.raccoon.punto.venta.controllers;

import mx.com.raccoon.punto.venta.services.units.IUnitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/units")
public class UnitController {

    private final IUnitService service;

    public UnitController(IUnitService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> listar(){
        return ResponseEntity.ok().body(service.findAll());
    }
}
