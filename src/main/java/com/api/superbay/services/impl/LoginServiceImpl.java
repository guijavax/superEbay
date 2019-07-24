package com.api.superbay.services.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
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
	public LoginEntitie login(LoginEntitie entitie) {
		
		try {
			entitie.setDataLogin(LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT)));
			return repository.save(entitie);
		} catch (Exception e){
			System.out.println(e);
		}
		return null;
	}
}
