package com.api.superbay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.superbay.entities.LoginEntitie;

@Repository
public interface LoginRepositorie extends JpaRepository<LoginEntitie, Long>{}
