package com.eugeniusz.geometry_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.eugeniusz.geometry_api.repository")
public class GeometryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeometryApiApplication.class, args);
	}

}
