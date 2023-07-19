package com.vivek.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.vivek.Model.Movies;
import com.vivek.Repositories.JpaRepositories;
@Service
public class Implement_Service {

	@Autowired
	JpaRepositories jpa;
	public String create(Movies movie) {
		movie.setCategory(movie.getCategory().toLowerCase());
		// TODO Auto-generated method stub
		jpa.save(movie);
		return "Record Inserted sucessfully";
	}
	public ResponseEntity<List<Movies>> getall() {
		// TODO Auto-generated method stub
		List<Movies> movieall=jpa.findAll();
		if(movieall==null) {
			return new ResponseEntity<List<Movies>>(movieall,HttpStatus.OK);	
		}
		else {
			return new ResponseEntity<List<Movies>>(movieall,HttpStatus.BAD_REQUEST);
		}
	}

}
