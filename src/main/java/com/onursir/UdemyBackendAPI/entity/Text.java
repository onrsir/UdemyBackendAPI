package com.onursir.UdemyBackendAPI.entity;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue("T")
public class Text extends Resource{
    private String content;
}
