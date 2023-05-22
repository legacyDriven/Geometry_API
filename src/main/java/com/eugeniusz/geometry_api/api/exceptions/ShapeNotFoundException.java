package com.eugeniusz.geometry_api.api.exceptions;

public class ShapeNotFoundException extends RuntimeException{
    public ShapeNotFoundException(Long id) {
        super("Could not find shape " + id);
    }
}
