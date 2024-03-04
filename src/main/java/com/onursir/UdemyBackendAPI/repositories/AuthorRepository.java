package com.onursir.UdemyBackendAPI.repositories;

import com.onursir.UdemyBackendAPI.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
