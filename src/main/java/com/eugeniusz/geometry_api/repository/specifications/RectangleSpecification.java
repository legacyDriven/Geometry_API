package com.eugeniusz.geometry_api.repository.specifications;


import com.eugeniusz.geometry_api.dto.search.filters.RectangleFilter;
import com.eugeniusz.geometry_api.model.shape.Rectangle;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public record RectangleSpecification(RectangleFilter filter) implements Specification<Rectangle> {

    @Override
    public Predicate toPredicate(Root<Rectangle> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();

        if (filter.getLengthFrom() != null) {
            predicates.add(builder.greaterThanOrEqualTo(root.get("length"), filter.getLengthFrom()));
        }

        if (filter.getLengthTo() != null) {
            predicates.add(builder.lessThanOrEqualTo(root.get("length"), filter.getLengthTo()));
        }

        if (filter.getWidthFrom() != null) {
            predicates.add(builder.greaterThanOrEqualTo(root.get("width"), filter.getWidthFrom()));
        }

        if (filter.getWidthTo() != null) {
            predicates.add(builder.lessThanOrEqualTo(root.get("width"), filter.getWidthTo()));
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

        return builder.and(predicates.toArray(new Predicate[0]));
    }
}

