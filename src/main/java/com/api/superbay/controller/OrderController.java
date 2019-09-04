package com.api.superbay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.superbay.services.interfaces.OrderService;

import static com.api.superbay.utils.Routes.*;

@RestController
@RequestMapping(BASIC + "/order")
public class OrderController {

	@Autowired
	private OrderService service;
}
