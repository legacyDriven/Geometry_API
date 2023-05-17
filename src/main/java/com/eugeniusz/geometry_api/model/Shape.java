package com.eugeniusz.geometry_api.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PROTECTED)
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Shape extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;

    @Enumerated(EnumType.STRING)
    ShapeType type;

    BigDecimal area;
    BigDecimal perimeter;

    public BigDecimal calculateArea(){
        return BigDecimal.ZERO;
    }
    public BigDecimal calculatePerimeter(){
        return BigDecimal.ZERO;
    }

}