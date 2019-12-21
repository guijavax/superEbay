package com.api.superbay.entities;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.api.superbay.utils.StatesOrder;

@Entity
@Table(name="order_bay")
public class OrderEntitie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private List<ProductEntitie> products;
	
	@OneToOne(mappedBy = "orderEntitie", cascade = CascadeType.ALL)
	private ClientEntitie clientEntitie;
	
	@Column(name="total_order")
	@NotNull
	private BigDecimal totalOrder;
	
	@Column(name="state_order")
	@NotNull
	private StatesOrder state;
	
}
