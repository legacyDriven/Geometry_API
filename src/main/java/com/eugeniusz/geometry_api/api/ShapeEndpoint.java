package com.eugeniusz.geometry_api.api;

import com.eugeniusz.geometry_api.dto.post.ShapeCreateRequest;
import com.eugeniusz.geometry_api.dto.search.filters.ShapeRequestFilter;
import com.eugeniusz.geometry_api.model.shape.Shape;
import com.eugeniusz.geometry_api.service.ShapeService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;


@RestController
@RequestMapping("/api/v1/shapes")
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(makeFinal = true, level = lombok.AccessLevel.PRIVATE)
public class ShapeEndpoint {

    ShapeService shapeService;

    @Operation(summary = "Retrieve shape from database by id")
    @GetMapping("/{id}")
    @ResponseStatus(OK)
    Shape getShapeById(@PathVariable Long id) {
        return shapeService.getById(id);
    }

    @Operation(summary = "Retrieve shapes from database by criteria")
    @GetMapping
    @ResponseStatus(PARTIAL_CONTENT)
    Page<Shape> getAll(@ModelAttribute ShapeRequestFilter request) {
        return shapeService.getAll(request);
    }

    @Operation(summary = "Persist shape in database")
    @PostMapping(consumes = "application/json")
    @ResponseStatus(CREATED)
    Shape createShape(@Valid @RequestBody ShapeCreateRequest request) {
        return shapeService.save(request);
    }

    @Operation(summary = "Update shape in db or create new")
    @PutMapping("/{id}")
    @ResponseStatus(OK)
    Shape updateShape(@PathVariable Long id, @Valid @RequestBody ShapeCreateRequest request) {
        return shapeService.update(id, request);
    }

    @Operation(summary = "Delete shape from database by id")
    @DeleteMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    void deleteShape(@PathVariable Long id) {
        shapeService.deleteById(id);
    }

}
