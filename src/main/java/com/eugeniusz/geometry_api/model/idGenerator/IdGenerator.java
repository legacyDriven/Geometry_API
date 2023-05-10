package com.eugeniusz.geometry_api.model.idGenerator;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import org.springframework.context.annotation.Profile;

public interface IdGenerator {

    @Profile("!prod")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_generator")
    @SequenceGenerator(name="seq_generator", sequenceName = "my_sequence", allocationSize=1)
    Long generateKey();

    @Profile("prod")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long generateProdKey();

}

