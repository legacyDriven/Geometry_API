package com.eugeniusz.geometry_api;

import jakarta.annotation.security.PermitAll;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@PermitAll
public class GeometryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeometryApiApplication.class, args);
	}

}
