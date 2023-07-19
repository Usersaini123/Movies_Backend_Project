package com.vivek.RestController;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.Model.Movies;
import com.vivek.Service.Implement_Service;

@RestController
@RequestMapping("/movies")
public class Controller {
	
	@Autowired
	Implement_Service service;
	
	@PostMapping("/create")
	public ResponseEntity<String> create(@RequestBody Movies movie){
		return ResponseEntity.ok(service.create(movie));
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Movies>> getall(){
		return service.getall();
	}
}
