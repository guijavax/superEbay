package com.api.superbay.services.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.superbay.entities.LoginEntitie;
import com.api.superbay.repositories.LoginRepositorie;
import com.api.superbay.services.interfaces.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	private static final String FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	@Autowired
	private LoginRepositorie repository;

	@Override
	public ResponseEntity login(LoginEntitie entitie) {
		
		final Logger LOGGER = Logger.getLogger(LoginEntitie.class);
		
		try {
			entitie.setDataLogin(LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT)));
			return ResponseEntity.ok(repository.save(entitie));
		} catch (Exception e){
			LOGGER.error(e.getMessage());
		}
		return null;
	}
	
}
