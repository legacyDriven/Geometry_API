package com.eugeniusz.geometry_api.api.exceptions;

public class ShapeNotFoundException extends RuntimeException{
    public ShapeNotFoundException(Long id) {
        super(String.format("Shape with id: %d does not exist.", id));
    }
}
