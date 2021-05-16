package com.example.entrevueSpringBoot.entrevuecontrolers;

import com.example.entrevueSpringBoot.entrevueentities.Film;
import com.example.entrevueSpringBoot.entrevueservices.IActorService;
import com.example.entrevueSpringBoot.entrevueservices.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FilmRestControler {
    @Autowired
    private IActorService actorService;
    @Autowired
    private IFilmService filmService;

    @RequestMapping(value="/api/film", method = RequestMethod.POST)
    public ResponseEntity<Film> addAFilm(@RequestBody Film film) {
        Film savedFilm= filmService.addAFilm(film);
        HttpStatus status = HttpStatus.CREATED;
        return  new ResponseEntity<>(savedFilm, status);
    }

    @RequestMapping(value="/api/film/{id}", method = RequestMethod.GET)
    public Film displayAFilm(@PathVariable("id") final Long id){
      return filmService.displayAFilm(id);
    }
}
