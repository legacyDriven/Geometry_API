package com.eugeniusz.geometry_api.model;

import com.eugeniusz.geometry_api.model.idGenerator.IdGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class User implements IdGenerator {

    @Id
    Long id;

    String name;

    String surname;

    String email;

    String password;

    @Override
    public Long generateKey() {
        return this.id;
    }

    @Override
    public Long generateProdKey() {
        return this.id;
    }
}
