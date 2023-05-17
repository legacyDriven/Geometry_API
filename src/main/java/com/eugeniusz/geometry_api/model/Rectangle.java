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
public class Rectangle extends Shape {
    BigDecimal length;
    BigDecimal width;

    public Rectangle(ShapeType type, BigDecimal length, BigDecimal width) {
        super.setType(type);
        this.length = length;
        this.width = width;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        if (getId() != null && !Objects.equals(getId(), rectangle.getId())) return false;
        return length != null && length.equals(rectangle.length) && width != null && width.equals(rectangle.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, width);
    }
}
