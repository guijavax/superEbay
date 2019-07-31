package com.api.superbay.controller;

import static com.api.superbay.utils.Routes.ADMIN;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.superbay.entities.ProductEntitie;
import com.api.superbay.services.interfaces.ProductService;

@RestController
@RequestMapping(path = ADMIN+"/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping("/insert")
	public ResponseEntity insert(@RequestBody ProductEntitie prod) throws Exception {
		if (service.insert(prod) != null) {
			return ResponseEntity.ok(service.findAll());
		}
		return null;
	}
	
	@GetMapping("/findAll")
	public ResponseEntity findAll() throws Exception {
		List<ProductEntitie> products = service.findAll();
		return (products != null && !products.isEmpty()) ? ResponseEntity.ok(products) : ResponseEntity.noContent().build();
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<ProductEntitie> findById(@PathVariable Long id) throws Exception {
		ProductEntitie prod = service.findById(id);
		return prod != null ? ResponseEntity.ok(prod) : ResponseEntity.noContent().build();
	}
}
