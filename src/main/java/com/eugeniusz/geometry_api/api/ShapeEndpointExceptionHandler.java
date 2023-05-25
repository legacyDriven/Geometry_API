package com.eugeniusz.geometry_api.api;

import com.eugeniusz.geometry_api.api.exceptions.ShapeNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice(basePackageClasses = ShapeEndpoint.class)
public class ShapeEndpointExceptionHandler {
    @ExceptionHandler(ShapeNotFoundException.class)
    public ResponseEntity<String> handleShapeNotFound(ShapeNotFoundException ex) {
        return ResponseEntity.status(NOT_FOUND).body("Shape not found: " + ex.getLocalizedMessage());
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        List<String> errors = ex.getBindingResult()  // BindingResult - obiekt zawierający informacje o błędach
                .getAllErrors().stream()  // getAllErrors - zwraca listę wszystkich błędów
                .map(ObjectError::getDefaultMessage) // pobiera komunikat błędu
                .collect(toList());

        return ResponseEntity.badRequest().body(errors);
    }
}
