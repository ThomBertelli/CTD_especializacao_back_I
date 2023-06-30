package com.example.catalog.service;


import com.example.movie.entity.Movie;

import java.util.List;

public interface CatalogService {

    List<Movie> getMovieByGenre(String genre);
}
