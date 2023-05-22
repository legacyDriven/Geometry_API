package com.eugeniusz.geometry_api.config;

import com.eugeniusz.geometry_api.model.shape.Circle;
import com.eugeniusz.geometry_api.model.shape.Rectangle;
import com.eugeniusz.geometry_api.model.shape.Square;
import com.eugeniusz.geometry_api.repository.ShapeRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Random;

@Profile("!dev")
@Configuration
public class TestDataInitializer implements CommandLineRunner {

    private final ShapeRepository repository;

    Random random = new Random();

    public TestDataInitializer(ShapeRepository entityRepository) {
        this.repository = entityRepository;
    }

    @Override
    public void run(String... args) {
        // Tworzenie danych testowych
        Faker faker = new Faker();
        System.out.println("faker on");
        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle(generateRandomBigDecimal());
            Square square = new Square(generateRandomBigDecimal());
            Rectangle rectangle = new Rectangle(generateRandomBigDecimal(), generateRandomBigDecimal());
            repository.saveAll(List.of(circle, square, rectangle));
        }
    }

    private static BigDecimal generateRandomBigDecimal() {
        Random random = new Random();
        return BigDecimal.valueOf(random.nextDouble() * 10)
                .setScale(2, RoundingMode.HALF_UP);
    }
}

