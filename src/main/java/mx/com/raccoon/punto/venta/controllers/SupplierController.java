package mx.com.raccoon.punto.venta.controllers;

import mx.com.raccoon.punto.venta.services.categories.ICategoryService;
import mx.com.raccoon.punto.venta.services.suppliers.ISupplierService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    private final ISupplierService service;

    public SupplierController(ISupplierService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List> listar(){
        return ResponseEntity.ok().body(service.findAll());
    }
}
