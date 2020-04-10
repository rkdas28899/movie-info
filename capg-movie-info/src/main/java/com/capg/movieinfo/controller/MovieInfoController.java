package com.capg.movieinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.capg.movieinfo.model.MovieInfo;
import com.capg.movieinfo.service.MovieInfoService;


public class MovieInfoController {
	@Autowired
	MovieInfoService service;
	@GetMapping("/id/{id}")
	public MovieInfo getMovieInfo(@PathVariable long id) {
		return service.getMovieInfo(id);
	}
	
	@GetMapping("/allInfo")
	public List<MovieInfo> getAllMovieCatelog(){
		return service.getAllMovieInfo();
	}
	@PostMapping("/addInfo")
	public MovieInfo addMovieCatelog(MovieInfo movie) {
		return service.addMovieInfo(movie);
	}
}
