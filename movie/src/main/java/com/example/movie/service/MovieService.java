package com.example.movie.service;

import com.example.movie.entity.Movie;

import java.util.List;

public interface MovieService {

    Iterable<Movie> getAll();

    List<Movie> getMovieByGenre(String genre);

    void addMovie(Movie movie);

    void updateMovie(Long id, Movie movie);

    void deleteMovie(Long id);

}
