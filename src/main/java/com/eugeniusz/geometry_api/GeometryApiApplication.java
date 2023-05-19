package com.eugeniusz.geometry_api;

import com.eugeniusz.geometry_api.repository.ShapeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.eugeniusz.geometry_api.repository")
public class GeometryApiApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
		SpringApplication.run(GeometryApiApplication.class, args);

		ShapeRepository repo = context.getBean(ShapeRepository.class);
	}

}
