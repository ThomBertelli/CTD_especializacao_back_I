package com.example.movie.service.impl;

import com.example.movie.entity.Movie;
import com.example.movie.repository.MovieRepository;
import com.example.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Iterable<Movie> getAll(){
        return movieRepository.findAll();
    }

    @Override
    public List<Movie> getMovieByGenre(String genre){
        return movieRepository.findByGenre(genre);
    }



    @Override
    public void addMovie(Movie movie){
        movieRepository.save(movie);

    }

    @Override
    public void updateMovie (Long id, Movie movie){
        movieRepository.save(movie);
    }

    @Override
    public void deleteMovie (Long id){
        movieRepository.deleteById(id);
    }


}
