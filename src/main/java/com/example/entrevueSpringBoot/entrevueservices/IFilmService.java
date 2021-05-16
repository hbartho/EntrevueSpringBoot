package com.example.entrevueSpringBoot.entrevueservices;

import com.example.entrevueSpringBoot.entrevueentities.Film;

public interface IFilmService {
    public Film addAFilm(Film film);
    public Film displayAFilm(Long id);
}
