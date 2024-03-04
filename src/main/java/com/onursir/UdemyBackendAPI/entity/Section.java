package com.onursir.UdemyBackendAPI.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Section extends BaseEntity{

    private String name;
    private int sectionOrder;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;
}
