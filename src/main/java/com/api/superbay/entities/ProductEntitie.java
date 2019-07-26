package com.api.superbay.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ProductEntitie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProduct;
	
	@Column(name = "cod_product")
	@NotNull
	private Long productCod;
	
	@Column(name = "product_name")
	private String nameProduct;
	
	@Column(name = "category")
	private String category;
	
	@Column(name="amount")
	private Integer amount;
	
	@Column(name = "price")
	private BigDecimal price;
	
	@Column(name="descricao")
	private String descri;

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

	public Long getProductCod() {
		return productCod;
	}

	public void setProductCod(Long productCod) {
		this.productCod = productCod;
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
}
