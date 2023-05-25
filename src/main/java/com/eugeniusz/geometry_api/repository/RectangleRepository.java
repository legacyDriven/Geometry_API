package com.eugeniusz.geometry_api.repository;

import com.eugeniusz.geometry_api.model.shape.Rectangle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RectangleRepository extends JpaRepository<Rectangle, Long>, JpaSpecificationExecutor<Rectangle> {
}
