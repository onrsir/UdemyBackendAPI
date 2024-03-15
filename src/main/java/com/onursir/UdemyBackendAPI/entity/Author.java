package com.onursir.UdemyBackendAPI.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
@SuperBuilder
@NamedQuery(
        name = "Author.findByNamedQuery",
        query = "select a from Author a where a.age >= :age"
)
public class Author extends BaseEntity{

    {
        courses = new ArrayList<>();
    }

    @Column(name = "f_name",length = 35)
    private String firstName;

    private String lastName;

    @Column(unique = true,nullable = false)
    private String email;

    private int age;



    @ManyToMany(mappedBy = "authors", fetch = FetchType.EAGER)
    private List<Course> courses;


}
