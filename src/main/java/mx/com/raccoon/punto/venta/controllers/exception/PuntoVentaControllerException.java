package mx.com.raccoon.punto.venta.controllers.exception;

import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import mx.com.raccoon.punto.venta.controllers.exception.error.PuntoVentaServiceException;
import mx.com.raccoon.punto.venta.utils.ErrorEnum;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestControllerAdvice
public class PuntoVentaControllerException {

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<?> handlerValidationException(MethodArgumentNotValidException ex){
        log.warn("Argumentos invalidos {}", ex.getMessage());
        List<String> errores1 = new ArrayList<>();
        //Map<String, String> errores = new HashMap<>();
        BindingResult binding = ex.getBindingResult();
        binding.getFieldErrors().forEach(err ->
               //errores.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage())
                errores1.add("El campo " + err.getField() + " " + err.getDefaultMessage())
        );
        return ResponseEntity.badRequest().body(new PuntoVentaServiceException(ErrorEnum.PV_GEN_01, errores1));
    }

    @ExceptionHandler(value = {ConstraintViolationException.class})
    public ResponseEntity<?> handlerValidationException(ConstraintViolationException ex){
        log.warn("Argumentos invalidos {}", ex.getMessage());
        return ResponseEntity.badRequest().body(new PuntoVentaServiceException(ErrorEnum.PV_GEN_01, "Parametro faltante en Entity"));
    }

    @ExceptionHandler(value = {SQLIntegrityConstraintViolationException.class})
    public ResponseEntity<?> handlerConstraintValidationException(SQLIntegrityConstraintViolationException ex){
        return ResponseEntity.badRequest().body(new PuntoVentaServiceException(ErrorEnum.PV_GEN_03, ex.getLocalizedMessage()));
    }
}
