package mx.com.raccoon.punto.venta.controllers;

import mx.com.raccoon.punto.venta.services.boxes.IBoxService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boxes")
public class BoxController {

    private final IBoxService service;

    public BoxController(IBoxService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> listar(){
        return ResponseEntity.ok().body(service.findAll());
    }
}
