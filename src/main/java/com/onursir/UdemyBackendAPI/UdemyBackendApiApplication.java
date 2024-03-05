package com.onursir.UdemyBackendAPI;

import com.github.javafaker.Faker;
import com.onursir.UdemyBackendAPI.entity.Author;
import com.onursir.UdemyBackendAPI.repositories.AuthorRepository;
import com.onursir.UdemyBackendAPI.repositories.VideoRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class UdemyBackendApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyBackendApiApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository){

		return args -> {
			for(int i=0; i<50; i++){
				Faker faker = new Faker();
				var author = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(faker.number().numberBetween(18,45))
						.email(faker.name().username() +"@gmail.com")
						.build();

				repository.save(author);

			}
/*
			repository.findByNamedQuery(32).forEach(System.out::println);
*/

		};



	}
}
