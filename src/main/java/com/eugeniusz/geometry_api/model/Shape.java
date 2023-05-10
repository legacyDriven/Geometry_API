package com.eugeniusz.geometry_api.model;

import java.time.LocalDateTime;

public interface Shape {
    long getId();
    ShapeType getType();
    double getArea();
    double getPerimeter();
    int getVersion();
    String getCreatedBy();
    LocalDateTime getCreatedAt();
    LocalDateTime getLastModifiedAt();
    String getLastModifiedBy();

    void calculateArea();
    void calculatePerimeter();
}
