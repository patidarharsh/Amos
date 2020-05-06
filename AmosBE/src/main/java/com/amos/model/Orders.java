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

	public int getOrdId() {
		return ordId;
	}

	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}

	public UserAmos getUser() {
		return user;
	}

	public void setUser(UserAmos user) {
		this.user = user;
	}

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getOrdStatus() {
		return ordStatus;
	}

	public void setOrdStatus(String ordStatus) {
		this.ordStatus = ordStatus;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getDeliveryContactNo() {
		return deliveryContactNo;
	}

	public void setDeliveryContactNo(String deliveryContactNo) {
		this.deliveryContactNo = deliveryContactNo;
	}

	public double getOrdTotalPrice() {
		return ordTotalPrice;
	}

	public void setOrdTotalPrice(double ordTotalPrice) {
		this.ordTotalPrice = ordTotalPrice;
	}

	public String getOrdPaymentMode() {
		return ordPaymentMode;
	}

	public void setOrdPaymentMode(String ordPaymentMode) {
		this.ordPaymentMode = ordPaymentMode;
	}

	public LocalDateTime getOrdCreationTime() {
		return ordCreationTime;
	}

	public void setOrdCreationTime(LocalDateTime ordCreationTime) {
		this.ordCreationTime = ordCreationTime;
	}

	public LocalDateTime getOrdShippedTime() {
		return ordShippedTime;
	}

	public void setOrdShippedTime(LocalDateTime ordShippedTime) {
		this.ordShippedTime = ordShippedTime;
	}

	public LocalDateTime getOrdModificationTime() {
		return ordModificationTime;
	}

	public void setOrdModificationTime(LocalDateTime ordModificationTime) {
		this.ordModificationTime = ordModificationTime;
	}

	@Override
	public String toString() {
		return "Orders [ordId=" + ordId + ", user=" + user + ", orderDetails=" + orderDetails + ", ordStatus="
				+ ordStatus + ", deliveryAddress=" + deliveryAddress + ", deliveryContactNo=" + deliveryContactNo
				+ ", ordTotalPrice=" + ordTotalPrice + ", ordPaymentMode=" + ordPaymentMode + ", ordCreationTime="
				+ ordCreationTime + ", ordShippedTime=" + ordShippedTime + ", ordModificationTime="
				+ ordModificationTime + "]";
	}
	
	
}
