package com.eugeniusz.geometry_api.model.shape;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Rectangle extends Shape {
    @Column(nullable = false)
    private BigDecimal length;

    @Column(nullable = false)
    private BigDecimal width;

    public Rectangle(BigDecimal length, BigDecimal width) {
        super.setType(ShapeType.RECTANGLE);
        this.length = length;
        this.width = width;
        updateAreaAndPerimeter();
    }

    public void setLength(BigDecimal length) {
        this.length = length;
        updateAreaAndPerimeter();
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
        updateAreaAndPerimeter();
    }

    private void updateAreaAndPerimeter() {
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
    }

    @Override
    public BigDecimal calculateArea() {
        return length.multiply(width);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return length.add(width).multiply(BigDecimal.valueOf(2));
    }
}
