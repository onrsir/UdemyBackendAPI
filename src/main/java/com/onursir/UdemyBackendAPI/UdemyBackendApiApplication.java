package com.onursir.UdemyBackendAPI;

import com.onursir.UdemyBackendAPI.entity.Author;
import com.onursir.UdemyBackendAPI.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UdemyBackendApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyBackendApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository){
		return args -> {
			var author = Author.builder()
					.firstName("onur")
					.lastName("sir")
					.age(24)
					.email("oonursir@gmail.com")
					.build();
			repository.save(author);
		};
	}
}
