package com.amos.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_variant")
public class ProductVariant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "var_id", nullable = false, unique = true)
	private int varId;
	
	@JoinColumn(name = "prd_id", referencedColumnName = "prd_id")
	@OneToOne(cascade = CascadeType.ALL)
	private Product product;
	
	@Column(name = "var_weight", nullable = false)
	private short varWeight;
	
	@Column(name = "var_sell_price")
	private double sellPrice;
	
	@Column(name = "var_purchase_price", nullable = false)
	private double varPurchasePrice;
	
	@Column(name = "var_in_stock", nullable = false)
	private int varInStock;
	
	@Column(name = "var_discount")
	private byte varDiscount;
	
	@Column(name = "var_is_active", nullable = false)
	private boolean varIsActive;
	
	@Column(name = "var_creation_date")
	private LocalDateTime varCreationTime;
	
	@Column(name = "var_modification_date")
	private LocalDateTime varModificationTime;

}
