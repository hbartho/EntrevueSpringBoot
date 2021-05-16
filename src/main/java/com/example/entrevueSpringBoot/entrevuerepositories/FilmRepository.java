package com.example.entrevueSpringBoot.entrevuerepositories;

import com.example.entrevueSpringBoot.entrevueentities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * RepositoryRestResource  utilisé pour exposer et tester directement le WS.
 *
 * exemples:
 * 1- "http://localhost:8080/films/4"
 * 2- "http://localhost:8080/films/4/acteurs"
 * 3- http://localhost:8080/films?page=1&size=3
 */
@RepositoryRestResource
public interface FilmRepository extends JpaRepository<Film,Long> {
}
