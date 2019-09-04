package com.api.superbay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.superbay.entities.OrderEntitie;

public interface OrderRepositorie extends JpaRepository<OrderEntitie, Long> {

}
