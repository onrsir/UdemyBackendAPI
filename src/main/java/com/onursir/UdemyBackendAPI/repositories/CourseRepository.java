package com.onursir.UdemyBackendAPI.repositories;

import com.onursir.UdemyBackendAPI.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
