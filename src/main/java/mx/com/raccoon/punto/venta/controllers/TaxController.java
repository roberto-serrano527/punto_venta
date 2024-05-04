package mx.com.raccoon.punto.venta.controllers;

import mx.com.raccoon.punto.venta.services.taxes.ITaxService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taxes")
public class TaxController {

    private final ITaxService service;

    public TaxController(ITaxService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> listar(){
        return ResponseEntity.ok().body(service.findAll());
    }
}
