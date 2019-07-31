package com.api.superbay.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="client")
public class ClientEntitie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idClient;
	
	@Column(name="client_name")
	@NotNull
	private String name;
	
	@Column(name="cpf")
	@NotNull
	private Long cpf;
	
	@Column(name="age")
	@NotNull
	private Integer age;
	
	@Embedded
	private Address address;

	public Long getClientId() {
		return idClient;
	}

	public void setClientId(Long idClient) {
		this.idClient = idClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
