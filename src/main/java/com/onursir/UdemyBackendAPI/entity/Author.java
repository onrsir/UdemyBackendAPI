package com.onursir.UdemyBackendAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Builder
public class Author {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "f_name",length = 35)
    private String firstName;

    private String lastName;

    @Column(unique = true,nullable = false)
    private String email;

    private int age;

    @Column(updatable = false/*,nullable = false*/)
    private LocalDateTime createdAt;

    @Column(insertable = false)
    private LocalDateTime lastModified;

}
