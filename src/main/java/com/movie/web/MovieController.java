package com.movie.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.movie.business.Movie;

@CrossOrigin
@RestController
@RequestMapping("/api/movies")
public class MovieController {
	//list movie
	private List<Movie> movies = new ArrayList<>();
	
	
	//get mapping - list all movies
	@GetMapping("/")
	public List<Movie> listMovies() {
		return movies;
	}
	
	
	//get mapping  add movie to list
	//?movie=Star Wars&year=1977
	@GetMapping("")
	public String addMovie(@RequestParam String title, @RequestParam int year) {
		Movie m = new Movie(title, year);
		movies.add(m);
		return m.getTitle() + " added!";
	}
}
