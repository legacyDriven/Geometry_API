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
public class Square extends Shape {

    @Column(nullable = false)
    private BigDecimal sideLength;

    public Square(BigDecimal side) {
        super.setType(ShapeType.SQUARE);
        this.sideLength = side;
        updateAreaAndPerimeter();
    }

    public void setSideLength(BigDecimal sideLength) {
        this.sideLength = sideLength;
        updateAreaAndPerimeter();
    }

    private void updateAreaAndPerimeter() {
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
    }

    @Override
    public BigDecimal calculateArea() {
        return sideLength.pow(2);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return sideLength.multiply(BigDecimal.valueOf(4));
    }
}







