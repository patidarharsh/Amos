package com.amos.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart_details")
public class CartDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_dtl_id")
	private int cartDtlId;
	
	@JoinColumn(name = "cart_id",referencedColumnName = "cart_id")
	@ManyToOne
	private Cart cart;
	
	@JoinColumn(name = "prd_id",referencedColumnName = "prd_id")
	@OneToOne(cascade = CascadeType.ALL)
	private Product product;
	
	@Column(name = "prd_qty", nullable = false)
	private int prdQty;
}
