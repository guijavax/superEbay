package com.api.superbay.services.interfaces;

import java.util.List;

import com.api.superbay.entities.ClientEntitie;

/**
 * 
 * @author gcarneib
 * Class responsavel pelas operacoes do cliente
 */
public interface ClientService {
	
	List<ClientEntitie> findAll() throws Exception;
	
	ClientEntitie findByCpf(Long cpf) throws Exception;
	
	List<ClientEntitie> findByName (String name) throws Exception;
	
	void removeClient(Long idClient) throws Exception;
	
	ClientEntitie insertClient(ClientEntitie client) throws Exception;
	
	ClientEntitie updateClient(ClientEntitie client) throws Exception;
	
	ClientEntitie findClientById(Long id) throws Exception;
}
