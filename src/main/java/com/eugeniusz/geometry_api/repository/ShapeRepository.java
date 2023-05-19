package com.eugeniusz.geometry_api.repository;

import com.eugeniusz.geometry_api.model.shared.Shape;
import com.eugeniusz.geometry_api.model.shared.ShapeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
public interface ShapeRepository extends JpaRepository<Shape, Long> {

}
