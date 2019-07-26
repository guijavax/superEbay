package com.api.superbay.services.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.api.superbay.entities.ProductEntitie;


/**
 * 
 * @author gcarneib
 * Classe quer realiza as operações de produto
 */
public interface ProductService {
	
	ProductEntitie insert(ProductEntitie product) throws Exception;
	
	List<ProductEntitie> findAll() throws Exception;
	
	ProductEntitie findById(Long id) throws Exception;
	
	ProductEntitie findByName(ProductEntitie product);
	
	void updateProduct (ProductEntitie product) throws Exception;
	
	ProductEntitie updateAmount(ProductEntitie produto, String operation) throws Exception;
	
	
}
