package com.api.superbay.services.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.superbay.entities.ProductEntitie;
import com.api.superbay.repositories.ProductRepositorie;
import com.api.superbay.services.interfaces.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepositorie repositorie;
	
	private static final Logger LOGGER = Logger.getLogger(ProductServiceImpl.class);
	
	@Override
	public ProductEntitie insert(ProductEntitie product) throws Exception {
		if (product != null) {
			try {
				return repositorie.save(product);
			} catch(Exception e) {
				LOGGER.error(e.getMessage());
				return null;
			}
		}
		return null;	
	}

	@Override
	public List<ProductEntitie> findAll() throws Exception {
		return repositorie.findAll();
	}

	@Override
	public ProductEntitie findById(Long id) throws Exception {
		return id != null ? repositorie.findOne(id) : null;
	}

	@Override
	public List<ProductEntitie> findByName(String name) {
		return repositorie.findProductByName(name);
	}

	@Override
	public void updateProduct(ProductEntitie product) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public ProductEntitie updateAmount(ProductEntitie produto, String operation) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
