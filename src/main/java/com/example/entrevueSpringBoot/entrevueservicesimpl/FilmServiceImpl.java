package com.example.entrevueSpringBoot.entrevueservicesimpl;

import com.example.entrevueSpringBoot.entrevueentities.Film;
import com.example.entrevueSpringBoot.entrevuerepositories.ActorRepository;
import com.example.entrevueSpringBoot.entrevuerepositories.FilmRepository;
import com.example.entrevueSpringBoot.entrevueservices.IFilmService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class FilmServiceImpl implements IFilmService {

    private FilmRepository filmRepository;
    private ActorRepository actorRepository;

    public FilmServiceImpl(FilmRepository filmRepository, ActorRepository actorRepository) {
        this.filmRepository = filmRepository;
        this.actorRepository = actorRepository;
    }

    @Override
    @Transactional
    public Film addAFilm(Film film) {

        if (film.getActeurs()!=null && film.getActeurs().size()>0){
          film.getActeurs().forEach(actor -> actorRepository.save(actor));
        }
        return filmRepository.save(film);
    }

    @Override
    @Transactional
    public Film displayAFilm(Long id) {
        Optional<Film> film = filmRepository.findById(id);
        if (!film.isPresent())  {
          throw new RuntimeException("No Film presents with id: "+id);
        }

        return film.get();
    }
}
