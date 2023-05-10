package com.eugeniusz.geometry_api.config;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.eugeniusz.geometry_api.repository") //
public class PersistenceConfig {
}
