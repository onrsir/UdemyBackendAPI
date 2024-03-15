package com.onursir.UdemyBackendAPI.repositories;

import com.onursir.UdemyBackendAPI.entity.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Integer> {

    List<Author> findByNamedQuery(@Param("age") int age);

    // select * from author where first_name = 'onur'
    List<Author> findAllByFirstName(String fn);

    // select * from author where first_name = 'onu'
    List<Author> findAllByFirstNameIgnoreCase(String fn);


    // select * from author where first_name like '%onu%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);


    // select * from author where first_name like 'onu%'
    List<Author> findAllByFirstNameStartingWithIgnoreCase(String fn);

    // select * from author where first_name like '%onu'
    List<Author> findAllByFirstNameEndingWithIgnoreCase(String fn);


    // select * from author where first_name in ('onu', 'sir', 'iau')
    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);


    List<Author> findTop3ByOrderByAgeDesc();

    List<Author> findByEmailContainingIgnoreCase(String mail);

    List<Author> getAllBy();



}
