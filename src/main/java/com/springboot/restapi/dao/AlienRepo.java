package com.springboot.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.restapi.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
