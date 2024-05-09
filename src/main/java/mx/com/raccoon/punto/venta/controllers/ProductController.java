package mx.com.raccoon.punto.venta.controllers;

import jakarta.validation.Valid;
import mx.com.raccoon.punto.venta.models.ProductModel;
import mx.com.raccoon.punto.venta.models.entities.Product;
import mx.com.raccoon.punto.venta.services.products.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final IProductService service;

    public ProductController(IProductService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> crear(@Valid @RequestBody ProductModel product, BindingResult result){
        return new ResponseEntity<>(service.guardarProducto(product), HttpStatus.CREATED);
    }

    @GetMapping("/{code}")
    public ResponseEntity<Product> busquedaPorCodigo(@PathVariable Long code){
        return new ResponseEntity<>(service.busquedaPorCodigo(code), HttpStatus.OK);
    }
}
