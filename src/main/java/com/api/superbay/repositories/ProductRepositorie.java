package com.api.superbay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.superbay.entities.ProductEntitie;

@Repository
public interface ProductRepositorie extends JpaRepository<ProductEntitie, Long>{}
