package com.onursir.UdemyBackendAPI.entity;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@EqualsAndHashCode(callSuper = true)
/*
@DiscriminatorValue("V")
*/
@Polymorphism(type = PolymorphismType.EXPLICIT)
public class Video extends Resource {
    private int length;
}
