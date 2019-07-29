package com.api.superbay.services.interfaces;

import org.springframework.http.ResponseEntity;

import com.api.superbay.entities.LoginEntitie;

/**
 * 
 * @author gcarneib<br>
 * Classe responsavel por efetuar o login
 */
public interface LoginService {
	
	/**
	 * 
	 * @param entitie
	 * @return
	 * metodo responsavel por salvar o historico de login
	 */
	LoginEntitie login(LoginEntitie entitie);
}
