package com.api.superbay.controller;

import static com.api.superebay.utils.Routes.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.superbay.entities.LoginEntitie;
import com.api.superbay.repositories.LoginRepositorie;

@RestController
@RequestMapping(value = ROOT)
public class LoginController {
	
	@Autowired
	private LoginRepositorie repository;
	
	@PostMapping(path="/insert")
	public void insert(@RequestBody LoginEntitie login) {
		repository.save(login);
	}
}
