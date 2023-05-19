package com.eugeniusz.geometry_api.model.shared;

import com.eugeniusz.geometry_api.model.shared.ShapeType;
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

@MappedSuperclass
@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
//@RequiredArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "shape_type")
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Shape {

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