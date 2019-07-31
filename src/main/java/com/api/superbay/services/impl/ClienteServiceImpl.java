package com.api.superbay.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.superbay.entities.ClientEntitie;
import com.api.superbay.repositories.ClienteRepositorie;
import com.api.superbay.services.interfaces.ClientService;

@Service
public class ClienteServiceImpl implements ClientService{

	@Autowired
	private ClienteRepositorie repositorie;
	
	@Override
	public List<ClientEntitie> findAll() throws Exception {
		List<ClientEntitie> clients = repositorie.findAll();
		return (clients != null && !clients.isEmpty()) ? clients : null;
	}

	@Override
	public ClientEntitie findByCpf(Long cpf) throws Exception {
		ClientEntitie client = repositorie.findClientByCpf(cpf);
		return client != null ? client : null;
	}

	@Override
	public List<ClientEntitie> findByName(String name) throws Exception {
		List<ClientEntitie> clients = repositorie.findByName(name);
		return (clients != null && !clients.isEmpty()) ? clients : null;
	}

	@Override
	public void removeClient(Long idClient) throws Exception {
		repositorie.delete(idClient);
	}

	@Override
	public ClientEntitie insertClient(ClientEntitie client) throws Exception {
		return repositorie.save(client);
	}

	@Override
	public ClientEntitie updateClient(ClientEntitie client) throws Exception {
		return repositorie.saveAndFlush(client);
	}

	@Override
	public ClientEntitie findClientById(Long id) throws Exception {
		ClientEntitie client = repositorie.getOne(id);
		
		return client != null ? client : null;
	}
}
