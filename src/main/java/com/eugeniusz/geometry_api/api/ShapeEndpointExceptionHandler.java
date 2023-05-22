package com.eugeniusz.geometry_api.api;

import com.eugeniusz.geometry_api.api.exceptions.ShapeNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice(basePackageClasses = ShapeEndpoint.class)
public class ShapeEndpointExceptionHandler {
    @ExceptionHandler(ShapeNotFoundException.class)
    public ResponseEntity<String> handleShapeNotFound(ShapeNotFoundException ex) {
        return ResponseEntity.status(NOT_FOUND).body("Shape not found: " + ex.getLocalizedMessage());
    }
}
