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
@Table(name = "order_details")
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ord_dtl_id")
	private int ordDtlId;
	
	@JoinColumn(name = "ord_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private Orders order;
	
	@Column(name = "prd_id", nullable = false)
	private int prdId;
	
	@Column(name = "prd_name", nullable = false)
	private String prdName;
	
	@Column(name = "prd_qty", nullable = false)
	private String prdQty;
	
	@Column(name = "prd_price", nullable = false)
	private double prdPrice;
	
	@Column(name = "prd_discount")
	private byte prdDiscount;
	
	@Column(name = "prd_after_discount_price")
	private int prdAfterDiscountPrice;

	public int getOrdDtlId() {
		return ordDtlId;
	}

	public void setOrdDtlId(int ordDtlId) {
		this.ordDtlId = ordDtlId;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public String getPrdQty() {
		return prdQty;
	}

	public void setPrdQty(String prdQty) {
		this.prdQty = prdQty;
	}

	public double getPrdPrice() {
		return prdPrice;
	}

	public void setPrdPrice(double prdPrice) {
		this.prdPrice = prdPrice;
	}

	public byte getPrdDiscount() {
		return prdDiscount;
	}

	public void setPrdDiscount(byte prdDiscount) {
		this.prdDiscount = prdDiscount;
	}

	public int getPrdAfterDiscountPrice() {
		return prdAfterDiscountPrice;
	}

	public void setPrdAfterDiscountPrice(int prdAfterDiscountPrice) {
		this.prdAfterDiscountPrice = prdAfterDiscountPrice;
	}

	@Override
	public String toString() {
		return "OrderDetails [ordDtlId=" + ordDtlId + ", order=" + order + ", prdId=" + prdId + ", prdName=" + prdName
				+ ", prdQty=" + prdQty + ", prdPrice=" + prdPrice + ", prdDiscount=" + prdDiscount
				+ ", prdAfterDiscountPrice=" + prdAfterDiscountPrice + "]";
	}
	
	
}
