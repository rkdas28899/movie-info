package com.capg.movieinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.movieinfo.model.MovieInfo;

public interface MovieInfoRepo extends JpaRepository<MovieInfo, Long> {

}
