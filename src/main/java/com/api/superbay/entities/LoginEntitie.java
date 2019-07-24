package com.api.superbay.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "login")
public class LoginEntitie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private Long idLogin;
	
	@Column(name="id_user")
	private Long idUser;
	
	@Column(name="data_login")
	private String dataLogin;
	
	public Long getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(Long idLogin) {
		this.idLogin = idLogin;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getDataLogin() {
		return dataLogin;
	}

	public void setDataLogin(String dataLogin) {
		this.dataLogin = dataLogin;
	}
}
