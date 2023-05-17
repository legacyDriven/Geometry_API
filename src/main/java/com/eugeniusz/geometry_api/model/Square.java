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
public class Square extends Shape {
    BigDecimal side;

    public Square(ShapeType type, BigDecimal side) {
        super.setType(type);
        this.side = side;
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
    }

    @Override
    public BigDecimal calculateArea() {
        return side.pow(2);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return side.multiply(BigDecimal.valueOf(4));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Square square = (Square) o;
        if (getId() != null && !Objects.equals(getId(), square.getId())) return false;
        return side != null && side.equals(square.side);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }
}
