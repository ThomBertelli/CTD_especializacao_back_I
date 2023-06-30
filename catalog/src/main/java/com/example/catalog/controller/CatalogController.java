package com.example.catalog.controller;

import com.example.catalog.service.CatalogService;
import com.example.movie.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/{genre}")
    public List<Movie> getMovieByGenreCatalog(String genre){
        return catalogService.getMovieByGenre(genre);
    }

}
