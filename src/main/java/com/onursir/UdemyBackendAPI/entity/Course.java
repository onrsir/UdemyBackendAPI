package com.onursir.UdemyBackendAPI.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Course extends BaseEntity {

    public Course(String title, String description) {
        this.title = title;
        this.description = description;
    }

    private String title;
    private String description;

    @ManyToMany
    @JoinTable(
            name = "authors_courses",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private List<Author> authors;

    @OneToMany(mappedBy = "course")
    private List<Section> sections;



}
