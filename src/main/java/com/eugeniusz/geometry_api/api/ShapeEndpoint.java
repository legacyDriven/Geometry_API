package com.eugeniusz.geometry_api.api;

import com.eugeniusz.geometry_api.dto.ShapeCreateRequest;
import com.eugeniusz.geometry_api.factory.ShapeFactory;
import com.eugeniusz.geometry_api.model.shape.Shape;
import com.eugeniusz.geometry_api.repository.ShapeRepository;
import com.eugeniusz.geometry_api.service.ShapeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;


/*
Request do dodawania figur ma wygladac tak: @POST /api/v1/shapes body: { type: "NAZWA", parameters: [p1, p2 p3] } np dla kwadratu:
{ "type": "SQUARE", parameters: [10.0]} stworzc ma kwadarat o boku 10

response: (dla tego przykladu) 201 created, body: { "id", "type", "width", "version", "createdBy", "createdAt",
"lastModifiedAt", "lastModifiedBy", "area", "perimeter" }

endpoint ma byc dostepny tylko dla zalogowanych uzytkwonikow z rola CREATOR

drugi endpoint: @GET /api/v1/shapes?parameters... gdzie parameters to np: ?createdBy=...&type=...
&areaFrom=...&areaTo...&perimeterFrom=...&perimeterTo=...&widthFrom=...&widthTo=...&radiusFrom=...&radiusTo=... generalnie mozeby wyszukiwac po:

typie figury
pole od, pole do
obwod od, obwod do
data stworzenia od, do
kto stworzyl,
po parametrach figur, od - do
 */
@RestController("/api/v1/shapes")
@RequiredArgsConstructor
@Slf4j
public class ShapeEndpoint {

    private final ShapeService shapeService;

    @Operation(summary = "Get all shapes from database by criteria")
    @GetMapping
    @ResponseStatus(PARTIAL_CONTENT)
    Page<Shape> getAll(@RequestBody ShapePageRequest request) {
        return shapeService.getAllBy(request);
    }

    @Operation(summary = "Persist shape in database")
    @PostMapping
    @ResponseStatus(CREATED)
    Shape createShape(@RequestBody ShapeCreateRequest request) {
        Shape shape = ShapeFactory.createShape(request);
        return shapeService.save(shape);
    }

    @Operation(summary = "Delete shape from database by id")
    @DeleteMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    void deleteShape(@PathVariable Long id) {
        shapeService.deleteById(id);
    }

}