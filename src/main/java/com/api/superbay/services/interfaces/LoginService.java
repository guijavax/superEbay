package com.api.superbay.services.interfaces;

import org.springframework.http.ResponseEntity;

import com.api.superbay.entities.LoginEntitie;

/**
 * 
 * @author gcarneib<br>
 * Classe respons�vel por efetuar o login
 */
public interface LoginService {
	
	/**
	 * 
	 * @param entitie
	 * @return
	 * met�do respons�vel por salvar o hist�rico de login
	 */
	ResponseEntity login(LoginEntitie entitie);
}
