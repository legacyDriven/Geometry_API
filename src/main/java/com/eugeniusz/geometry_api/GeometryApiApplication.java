package com.eugeniusz.geometry_api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@OpenAPIDefinition
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.eugeniusz.geometry_api.repository")
public class GeometryApiApplication {

	public static void main(String[] args) {

//		ConfigurableApplicationContext context =
		SpringApplication.run(GeometryApiApplication.class, args);

//		ShapeRepository repo = context.getBean(ShapeRepository.class);
	}

}
