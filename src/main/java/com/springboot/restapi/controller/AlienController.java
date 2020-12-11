package com.springboot.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restapi.dao.AlienRepo;
import com.springboot.restapi.model.Alien;
//Restcot.. means it will be working fully for Rest API...
//status 404 resource is not available
@RestController
public class AlienController {
	@Autowired
	AlienRepo repo;
	
	
	@GetMapping("/aliens")
	
	public List<Alien> getAliens() {
		
		return repo.findAll();
	}
	
	@GetMapping("/aliens/{aid}")
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		
		return repo.findById(aid);
	}
	
   //if we will not @requestbody, it get reutrn null object(values will be null)
	//when server produces or sending the data to client , its means it produces..
	//when client sends data to server it consumes ....
	// or when server accepting the data from client it consume
	@PostMapping("/aliens")
	public Alien addtAliens(@RequestBody Alien alien) {
		
		 repo.save(alien);
		 return alien;
	}

}
