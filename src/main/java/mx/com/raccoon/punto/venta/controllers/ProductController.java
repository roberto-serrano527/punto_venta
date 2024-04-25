package mx.com.raccoon.punto.venta.controllers;

import mx.com.raccoon.punto.venta.models.entities.product.Product;
import mx.com.raccoon.punto.venta.services.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    IProductService service;

    public ProductController(IProductService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Product product, BindingResult result){
        if (result.hasErrors()){
            return validar(result);
        }
        return new ResponseEntity<>(service.guardarProducto(product), HttpStatus.CREATED);
    }

    @GetMapping("/{code}")
    public ResponseEntity<Product> busquedaPorCodigo(@PathVariable Long code){
        return new ResponseEntity<>(service.busquedaPorCodigo(code), HttpStatus.OK);
    }

    private ResponseEntity<Map<String, String>> validar(BindingResult result){
        Map<String, String> errores = new HashMap<>();
        result.getFieldErrors().forEach(err ->
            errores.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
        );
        return ResponseEntity.badRequest().body(errores);
    }
}
