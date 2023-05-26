package com.eugeniusz.geometry_api.model.shape;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@EntityListeners(AuditingEntityListener.class)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Shape  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    Long id;

    BigDecimal area;

    BigDecimal perimeter;

    @Enumerated(EnumType.STRING)
    @Column(insertable = false, updatable = false)
    ShapeType type;

    @Version
    Integer version;

    @CreatedBy
    String createdBy;

    @CreatedDate
    LocalDateTime createdAt;

    @LastModifiedDate
    LocalDateTime lastModifiedAt;

    @LastModifiedBy
    String lastModifiedBy;

    public BigDecimal calculateArea(){
        return BigDecimal.ZERO;
    };

    public BigDecimal calculatePerimeter(){
        return BigDecimal.ZERO;
    }

}