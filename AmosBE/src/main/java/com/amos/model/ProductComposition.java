package com.amos.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_composition")
public class ProductComposition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prd_cmp_id", nullable = false, unique = true)
	private int prdCmpId;
	
	@JoinColumn(name = "prd_id", referencedColumnName = "prd_id", nullable = false)
	@ManyToOne(cascade = CascadeType.ALL)
	private Product product;
	
	@Column(name = "ingredient", nullable = false)
	private String ingredient;
	
	@Column(name = "qty", nullable = false)
	private byte qty;
}
