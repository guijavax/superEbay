package com.api.superbay.services.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.superbay.entities.LoginEntitie;
import com.api.superbay.repositories.LoginRepositorie;
import com.api.superbay.security.Security;
import com.api.superbay.services.interfaces.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	private static final String FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	private static final Logger LOGGER = Logger.getLogger(LoginEntitie.class);
	
	@Autowired
	private LoginRepositorie repository;

	@Override
	public LoginEntitie login(LoginEntitie entitie) {
		try {
			entitie.setDataLogin(LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT)));
			return repository.save(entitie);
		} catch (Exception e){
			LOGGER.error(e.getMessage());
		}
		return null;
	}
}
