package com.api.superbay.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity(name = "product")
public class ProductEntitie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProduct;

	@Column(name = "product_name")
	@NotNull
	private String nameProduct;
	
	@Column(name = "category")
	@NotNull
	private String category;
	
	@Column(name="amount")
	@NotNull
	private Integer amount;
	
	@Column(name = "price")
	@NotNull
	private BigDecimal price;
	
	@Column(name="descricao")
	@NotNull
	private String descri;
	
	@ManyToOne
	@JoinColumn
	@NotNull
	private OrderEntitie order;

	public String getDescri() {
		return descri;
	}

	public void setDescri(String descri) {
		this.descri = descri;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduto(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public OrderEntitie getOrder() {
		return order;
	}

	public void setOrder(OrderEntitie order) {
		this.order = order;
	}
}
