package com.api.superbay.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.superbay.repositories.OrderRepositorie;
import com.api.superbay.services.interfaces.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepositorie repositorie;
}
