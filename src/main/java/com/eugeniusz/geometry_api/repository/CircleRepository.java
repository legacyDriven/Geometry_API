package com.eugeniusz.geometry_api.repository;

import com.eugeniusz.geometry_api.model.shape.Circle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CircleRepository
        extends JpaRepository<Circle, Long>,
        JpaSpecificationExecutor<Circle> {

}
