package com.example.catalog.service.impl;

import com.example.catalog.service.CatalogService;
import com.example.catalog.service.MovieClient;
import com.example.movie.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private MovieClient movieClient;

    @Override
    public List<Movie> getMovieByGenre(String genre){
        return movieClient.getMoviesByGenreEndpoint(genre);
    }

}
