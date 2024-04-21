package mx.com.raccoon.punto.venta.controllers;

import mx.com.raccoon.punto.venta.models.product.ProductIn;
import mx.com.raccoon.punto.venta.services.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    IProductService service;

    public ProductController(IProductService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody ProductIn product){
        service.guardarProducto(product);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
