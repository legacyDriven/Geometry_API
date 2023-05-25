package com.eugeniusz.geometry_api.repository;

import com.eugeniusz.geometry_api.model.shape.Square;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SquareRepository extends JpaRepository<Square, Long>, JpaSpecificationExecutor<Square> {
}
