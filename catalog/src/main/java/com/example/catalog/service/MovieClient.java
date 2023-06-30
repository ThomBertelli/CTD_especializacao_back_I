package com.example.catalog.service;


import com.example.movie.entity.Movie;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("MOVIE-SERVICE")
@LoadBalancerClient("MOVIE-SERVICE")
public interface MovieClient {

    @GetMapping("/movies/{genre}")
    List<Movie> getMoviesByGenreEndpoint(@PathVariable String genre);


}
