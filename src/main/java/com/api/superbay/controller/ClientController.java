package com.api.superbay.controller;

import static com.api.superbay.utils.Routes.ROOT;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.superbay.entities.ClientEntitie;
import com.api.superbay.services.interfaces.ClientService;


@RestController
@RequestMapping(ROOT + "/client")
public class ClientController {
	
	private static final Logger LOGGER = Logger.getLogger(ClientController.class);
	
	@Autowired
	private ClientService service;

	@GetMapping("/findAll")
	public ResponseEntity<List<ClientEntitie>> findAll() {
		List<ClientEntitie> clients = null;
		try {
			clients = service.findAll();
			return (clients != null && !clients.isEmpty()) ? ResponseEntity.ok(clients) : ResponseEntity.noContent().build();		
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return getProblem();
		}
	}
	
	@GetMapping("/findByCpf/{cpf}")
	public ResponseEntity<ClientEntitie> findByCpf(@PathVariable(name = "cpf") Long cpf) {
		try {
			ClientEntitie entitie = service.findByCpf(cpf);
			return entitie != null ? ResponseEntity.ok(entitie) : ResponseEntity.noContent().build();
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return getProblem();
		}
	}
	
	@GetMapping("/findByName/{name}")
	public ResponseEntity<List<ClientEntitie>> findByName(@PathVariable(name="name") String name) {
		try {
			List<ClientEntitie> clients = service.findByName(name);
			return (clients != null && !clients.isEmpty()) ? ResponseEntity.ok(clients) : ResponseEntity.noContent().build();
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return getProblem();
		}
	}
	
	@PostMapping("/insertClient")
	public ResponseEntity<ClientEntitie> insertUser(@RequestBody ClientEntitie client, HttpServletResponse response) {
		try {
			ClientEntitie newClient = service.insertClient(client);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{idClient}").buildAndExpand(newClient.getClientId()).toUri();
			response.setHeader("Location", uri.toASCIIString());
			return ResponseEntity.created(uri).body(newClient);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return getProblem();
		}
	}
	
	@GetMapping("/{idClient}")
	public ClientEntitie findClientById(@PathVariable Long id) {
		try {
			ClientEntitie client = service.findClientById(id);
			return client != null ? client : null;
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}
	
	@DeleteMapping("/deleteClient/{codigo}")
	public ResponseEntity removeClientById(@PathVariable Long codigo) {
		try {
			service.removeClient(codigo);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return getProblem();
		}
	}
	
	@PutMapping("/updateClient")
	public ResponseEntity<ClientEntitie> updateClient(@RequestBody ClientEntitie client) {
		try {
			ClientEntitie cli = service.updateClient(client);
			return ResponseEntity.ok(cli);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return getProblem();
		}
	}
	
	private ResponseEntity getProblem() {
		return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build();
	}
}
