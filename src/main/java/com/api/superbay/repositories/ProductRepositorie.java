package com.api.superbay.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.superbay.entities.ProductEntitie;

@Repository
public interface ProductRepositorie extends JpaRepository<ProductEntitie, Long>{
	
	@Query(value = "select * from product where product_name like :name%")
	public List<ProductEntitie> findProductByName(@Param("name") String name);
}
