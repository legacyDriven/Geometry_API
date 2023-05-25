package com.eugeniusz.geometry_api.api;

import com.eugeniusz.geometry_api.dto.post.ShapeCreateRequest;
import com.eugeniusz.geometry_api.model.shape.Shape;
import com.eugeniusz.geometry_api.service.ShapeService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;


@RestController
@RequestMapping("/api/v1/shapes")
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(makeFinal = true, level = lombok.AccessLevel.PRIVATE)
public class ShapeEndpoint {

    ShapeService shapeService;

    @Operation(summary = "Retrieve shapes from database by criteria")
    @GetMapping
    @ResponseStatus(PARTIAL_CONTENT)
    Page<Shape> getAll(@RequestBody ShapePageRequest request) {
        return shapeService.getAllBy(request);
    }

    @Operation(summary = "Persist shape in database")
    @PostMapping
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
