package com.capg.movieinfo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorController {		
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code=HttpStatus.NOT_FOUND,reason = "Movie-Info Not Found", value = HttpStatus.NOT_FOUND)
	public void handleError() {
			
	}
}
