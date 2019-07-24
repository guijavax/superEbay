package com.api.superbay.services.interfaces;

import org.springframework.http.ResponseEntity;

import com.api.superbay.entities.LoginEntitie;

public interface LoginService {
	ResponseEntity login(LoginEntitie entitie);
}
