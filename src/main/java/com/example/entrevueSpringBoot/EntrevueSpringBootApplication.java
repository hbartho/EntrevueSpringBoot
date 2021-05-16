package com.example.entrevueSpringBoot;

import com.example.entrevueSpringBoot.entrevueentities.Actor;
import com.example.entrevueSpringBoot.entrevueentities.Film;
import com.example.entrevueSpringBoot.entrevueservices.IActorService;
import com.example.entrevueSpringBoot.entrevueservices.IFilmService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.ArrayList;
import java.util.Collection;

@SpringBootApplication
public class EntrevueSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntrevueSpringBootApplication.class, args);
	}

	@Bean
	CommandLineRunner start(IFilmService filmService, IActorService actorService){
		return args -> {
			//create the first actor
			Actor actor1 = Actor.newInstance( "Ford", "Harrison");
			actorService.addAnActor(actor1);

			//prepare the GET response
			Film film1 = Film.newInstance("Star Wars: The Empire Strikes Back",
					"Darth Vader is adamant about turning Luke Skywalker to the dark side.");
			Collection<Actor> actors = new ArrayList<>();
			Actor actor2 = Actor.newInstance("Ford", "Harrison");
			actorService.addAnActor(actor2);
			Actor actor3 = Actor.newInstance("Ford", "Harrison");
			actorService.addAnActor(actor3);
			actors.add(actor2);
			actors.add(actor3);
			film1.setActeurs(actors);
			filmService.addAFilm(film1);

			//create actor No:4
			Actor actor4 = Actor.newInstance("Ford", "Harrison");
			actorService.addAnActor(actor4);

			//create Films No:2 and No:3 without actors
			Film film2 =  Film.newInstance("Star Wars: The Empire Strikes Back",
					"Darth Vader is adamant about turning Luke Skywalker to the dark side.");
			filmService.addAFilm(film2);

			Film film3 = Film.newInstance("Star Wars: The Empire Strikes Back",
					"Darth Vader is adamant about turning Luke Skywalker to the dark side.");
			filmService.addAFilm(film3);
		};
	}

}
