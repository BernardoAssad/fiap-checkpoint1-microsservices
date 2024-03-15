package br.com.fiap.checkpoint1.controller;


import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.core.env.Environment;


@RestController

@RequestMapping

public class Checkpoint1Controller {

	@Autowired

	Environment env;
	
	@GetMapping("/ping")
	
	public String ping() {
		return ("Pong em " + env.getActiveProfiles()[0]);
	}
	
}