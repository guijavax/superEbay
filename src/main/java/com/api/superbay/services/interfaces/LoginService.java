package com.api.superbay.services.interfaces;

import org.springframework.http.ResponseEntity;

import com.api.superbay.entities.LoginEntitie;

/**
 * 
 * @author gcarneib<br>
 * Classe responsável por efetuar o login
 */
public interface LoginService {
	
	/**
	 * 
	 * @param entitie
	 * @return
	 * metódo responsável por salvar o histórico de login
	 */
	ResponseEntity login(LoginEntitie entitie);
}
