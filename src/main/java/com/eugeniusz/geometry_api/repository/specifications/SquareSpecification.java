package com.eugeniusz.geometry_api.repository.specifications;

import com.eugeniusz.geometry_api.dto.search.filters.SquareFilter;
import com.eugeniusz.geometry_api.model.shape.Square;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public record SquareSpecification(SquareFilter filter) implements Specification<Square> {

    @Override
    public Predicate toPredicate(Root<Square> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();

        if (filter.getSideFrom() != null) {
            predicates.add(builder.greaterThanOrEqualTo(root.get("side"), filter.getSideFrom()));
        }

        if (filter.getSideTo() != null) {
            predicates.add(builder.lessThanOrEqualTo(root.get("side"), filter.getSideTo()));
        }

        if (filter.getSideFrom() != null) {
            predicates.add(builder.greaterThanOrEqualTo(root.get("side"), filter.getSideFrom()));
        }

        if (filter.getAreaFrom() != null) {
            predicates.add(builder.greaterThanOrEqualTo(root.get("area"), filter.getAreaFrom()));
        }

        if (filter.getAreaTo() != null) {
            predicates.add(builder.lessThanOrEqualTo(root.get("area"), filter.getAreaTo()));
        }

        if (filter.getPerimeterFrom() != null) {
            predicates.add(builder.greaterThanOrEqualTo(root.get("perimeter"), filter.getPerimeterFrom()));
        }

        if (filter.getPerimeterTo() != null) {
            predicates.add(builder.lessThanOrEqualTo(root.get("perimeter"), filter.getPerimeterTo()));
        }

        if (filter.getCreatedAt() != null) {
            predicates.add(builder.greaterThanOrEqualTo(root.get("createdAt"), filter.getCreatedAt()));
        }

        if (filter.getLastModifiedAt() != null) {
            predicates.add(builder.lessThanOrEqualTo(root.get("lastModifiedAt"), filter.getLastModifiedAt()));
        }

        if (filter.getCreatedBy() != null) {
            predicates.add(builder.equal(root.get("createdBy"), filter.getCreatedBy()));
        }

        if (filter.getLastModifiedBy() != null) {
            predicates.add(builder.equal(root.get("lastModifiedBy"), filter.getLastModifiedBy()));
        }

        return builder.and(predicates.toArray(new Predicate[0]));
    }
}

