package com.example.entrevueSpringBoot.entrevuerepositories;

import com.example.entrevueSpringBoot.entrevueentities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ActorRepository extends JpaRepository<Actor,Long> {
}
