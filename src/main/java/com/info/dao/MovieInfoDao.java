package com.info.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.info.model.Movie;

@Repository
public class MovieInfoDao {

	private List<Movie> movies = Arrays.asList(
			new Movie(1, "Rock On", "Musical Drama"),
			new Movie(2, "Dil Chahta Hai", "Friends Movie"),
			new Movie(3, "Ghajini", "Action Movie"));

	public Movie getMovieInfo(int movieId) {		
		return movies.stream(). filter(m->m.getMovieId() == movieId).findAny().get();
	}
	
}
