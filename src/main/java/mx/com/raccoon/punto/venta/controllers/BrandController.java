package mx.com.raccoon.punto.venta.controllers;

import mx.com.raccoon.punto.venta.services.brands.IBrandService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brands")
public class BrandController {

    private final IBrandService service;

    public BrandController(IBrandService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> listar(){
        return ResponseEntity.ok().body(service.findAll());
    }
}
