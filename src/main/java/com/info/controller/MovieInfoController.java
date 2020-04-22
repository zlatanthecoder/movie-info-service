package com.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.info.config.AppConfig;
import com.info.model.Movie;
import com.info.model.MovieSummary;
import com.info.service.MovieInfoService;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

	@Autowired
	private MovieInfoService movieInfoService;
	
	@Autowired
	private AppConfig appConfig;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{movieid}")
	public Movie getMovieInfo(@PathVariable("movieid") int movieId) {
		//return movieInfoService.getMovieInfo(movieId); calling internal service
		
		//calling external service		
		MovieSummary movieSummary= restTemplate.getForObject(appConfig.movieDbServiceUrl, MovieSummary.class, movieId); //movieId will be passed to {movieid} in the property file
		return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
	}
}
