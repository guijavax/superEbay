package com.api.superbay.controller;

import static com.api.superbay.utils.Routes.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.superbay.entities.LoginEntitie;
import com.api.superbay.services.interfaces.LoginService;

@RestController
@RequestMapping(value = ROOT)
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@PostMapping(path="/insert")
	public void insert(@RequestBody LoginEntitie login) {
		service.login(login);
	}
}
