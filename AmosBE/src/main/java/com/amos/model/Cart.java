package com.amos.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private int cartId;
	
	@JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
	@OneToOne(cascade = CascadeType.ALL)
	private UserAmos user;
	
	@OneToMany(mappedBy = "cart")
	private List<CartDetails> cartDetails;
	
	@Column(name = "crt_total_price", nullable = false)
	private double cartTotalPrice;
	
	@Column(name = "cart_creation_date")
	private LocalDateTime cartCreationDate;
	
	@Column(name = "cart_modification_date")
	private LocalDateTime cartModificationDate;
}
