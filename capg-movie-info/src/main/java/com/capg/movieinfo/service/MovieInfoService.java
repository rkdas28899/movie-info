package com.capg.movieinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.movieinfo.model.MovieInfo;
import com.capg.movieinfo.repository.MovieInfoRepo;

public class MovieInfoService {
	@Autowired
	MovieInfoRepo repo;
	public MovieInfo getMovieInfo(long id) {
		return repo.getOne(id);
	}
	public List<MovieInfo> getAllMovieInfo() {
		return repo.findAll();
	}
	public MovieInfo addMovieInfo(MovieInfo movie) {
		return repo.save(movie);
	}
}
