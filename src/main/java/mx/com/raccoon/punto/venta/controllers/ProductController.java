package mx.com.raccoon.punto.venta.controllers;

import mx.com.raccoon.punto.venta.models.entities.product.Product;
import mx.com.raccoon.punto.venta.services.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    IProductService service;

    public ProductController(IProductService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Product product){
        service.guardarProducto(product);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{code}")
    public ResponseEntity<Product> busquedaPorCodigo(@PathVariable Long code){
        return new ResponseEntity<>(service.busquedaPorCodigo(code), HttpStatus.OK);
    }
}
