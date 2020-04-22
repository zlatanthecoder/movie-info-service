package com.info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.dao.MovieInfoDao;
import com.info.model.Movie;

@Service
public class MovieInfoService {

	@Autowired
	private MovieInfoDao movieInfoDao;
	
	public Movie getMovieInfo(int movieId) {
		return movieInfoDao.getMovieInfo(movieId);
	}
	
}
