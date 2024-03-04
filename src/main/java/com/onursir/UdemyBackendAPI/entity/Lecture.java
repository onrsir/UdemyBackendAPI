package com.onursir.UdemyBackendAPI.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Lecture extends BaseEntity{

    private String name;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;
}
