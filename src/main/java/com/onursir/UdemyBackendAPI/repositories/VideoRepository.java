package com.onursir.UdemyBackendAPI.repositories;

import com.onursir.UdemyBackendAPI.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Integer> {
}
