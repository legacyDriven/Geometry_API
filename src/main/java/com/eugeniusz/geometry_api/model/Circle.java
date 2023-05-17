package com.eugeniusz.geometry_api.model;


import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.Hibernate;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Circle extends Shape {

    BigDecimal radius;

    public Circle(ShapeType type, BigDecimal radius) {
        super.setType(type);
        this.radius = radius;
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
    }

    @Override
    public BigDecimal calculateArea() {
        return this.
                radius.pow(2).
                multiply(BigDecimal.valueOf(Math.PI));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return this.
                radius.multiply(BigDecimal.valueOf(2))
                .multiply(BigDecimal.valueOf(Math.PI));
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Circle circle = (Circle) o;

        if (getId() != null && !Objects.equals(getId(), circle.getId())) return false;

        return radius != null && radius.equals(circle.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}
