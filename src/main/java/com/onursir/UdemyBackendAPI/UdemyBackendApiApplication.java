package com.onursir.UdemyBackendAPI;

import com.github.javafaker.Faker;
import com.onursir.UdemyBackendAPI.entity.Author;
import com.onursir.UdemyBackendAPI.entity.Course;
import com.onursir.UdemyBackendAPI.entity.Lecture;
import com.onursir.UdemyBackendAPI.entity.Section;
import com.onursir.UdemyBackendAPI.repositories.AuthorRepository;
import com.onursir.UdemyBackendAPI.repositories.CourseRepository;
import com.onursir.UdemyBackendAPI.repositories.VideoRepository;
import com.zaxxer.hikari.util.FastList;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class UdemyBackendApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyBackendApiApplication.class, args);

	}

	@Bean
	@Transactional
	public CommandLineRunner commandLineRunner(AuthorRepository repository, CourseRepository courseRepository) {
		return args -> {
			for (int i = 0; i < 50; i++) {
				Faker faker = new Faker();
				List<Course> courseList = new ArrayList<>();

				for (int j = 0; j < 5; j++) { // Örnek olarak her yazar için 5 kurs ekleyelim
					Course tempCourse = new Course(faker.name().title(), faker.address().cityName());
					// Kaydedilen Course nesnesini almak için save'i kullanın
					Course savedCourse = courseRepository.save(tempCourse);
					// Kaydedilen kursu listeye ekleyin
					courseList.add(savedCourse);
				}
				// Sonra Author nesnesini oluşturun ve courseList'i ilişkilendirin
				Author author = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(faker.number().numberBetween(18, 45))
						.email(faker.internet().emailAddress())
						.courses(courseList)
						.build();
				repository.save(author);
			}



		};

	}


/*
			repository.findByNamedQuery(32).forEach(System.out::println);
*/
/*
			repository.findAllByFirstNameContainingIgnoreCase("er").forEach(System.out::println);
*/
/*
			repository.findTop3ByOrderByAgeDesc().forEach(System.out::println);
*/
		};





