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
@Table(name = "orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ord_id")
	private int ordId;
	
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	@OneToOne(cascade = CascadeType.ALL)
	private UserAmos user;
	
	@OneToMany(mappedBy = "order")
	private List<OrderDetails> orderDetails;
	
	@Column(name = "ord_status", nullable = false)
	private String ordStatus;
	
	@Column(name = "delivery_address", nullable = false)
	private String deliveryAddress;
	
	@Column(name = "delivery_contact_no", nullable = false)
	private String deliveryContactNo;
	
	@Column(name = "ord_total_price", nullable = false)
	private double ordTotalPrice;
	
	@Column(name = "ord_payment_mode", nullable = false)
	private String ordPaymentMode;
	
	@Column(name = "ord_creation_time")
	private LocalDateTime ordCreationTime;
	
	@Column(name = "ord_shipped_time")
	private LocalDateTime ordShippedTime;
	
	@Column(name = "ord_modification_time")
	private LocalDateTime ordModificationTime;
	
}
