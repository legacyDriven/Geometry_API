package com.eugeniusz.geometry_api.model.shape;

import com.eugeniusz.geometry_api.model.user.Address;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class Circle extends Shape {

    @Column(nullable = false)
    private BigDecimal radius;

    public Circle(BigDecimal radius) {
        super.setType(ShapeType.CIRCLE);
        this.radius = radius;
        updateAreaAndPerimeter();
    }

    public void setRadius(BigDecimal radius) {
        this.radius = radius;
        updateAreaAndPerimeter();
    }

    private void updateAreaAndPerimeter() {
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
    }

    @Override
    public BigDecimal calculateArea() {
        return radius.pow(2).multiply(BigDecimal.valueOf(Math.PI));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return radius.multiply(BigDecimal.valueOf(2)).multiply(BigDecimal.valueOf(Math.PI));
    }
}
