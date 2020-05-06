package com.amos.model;

import java.time.LocalDateTime;

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
@Table(name = "product_variant")
public class ProductVariant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "var_id", nullable = false, unique = true)
	private int varId;
	
	@JoinColumn(name = "prd_id", referencedColumnName = "prd_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private Product product;
	
	@Column(name = "var_weight", nullable = false)
	private short varWeight;
	
	@Column(name = "var_sell_price")
	private double varSellPrice;
	
	@Column(name = "var_purchase_price", nullable = false)
	private double varPurchasePrice;
	
	@Column(name = "var_in_stock", nullable = false)
	private int varInStock;
	
	@Column(name = "var_discount")
	private int varDiscount;
	
	@Column(name = "var_is_active", nullable = false)
	private boolean varIsActive;
	
	@Column(name = "var_creation_date")
	private LocalDateTime varCreationTime;
	
	@Column(name = "var_modification_date")
	private LocalDateTime varModificationTime;

	public int getVarId() {
		return varId;
	}

	public void setVarId(int varId) {
		this.varId = varId;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public short getVarWeight() {
		return varWeight;
	}

	public void setVarWeight(short varWeight) {
		this.varWeight = varWeight;
	}

	public double getVarSellPrice() {
		return varSellPrice;
	}

	public void setVarSellPrice(double varSellPrice) {
		this.varSellPrice = varSellPrice;
	}

	public double getVarPurchasePrice() {
		return varPurchasePrice;
	}

	public void setVarPurchasePrice(double varPurchasePrice) {
		this.varPurchasePrice = varPurchasePrice;
	}

	public int getVarInStock() {
		return varInStock;
	}

	public void setVarInStock(int varInStock) {
		this.varInStock = varInStock;
	}

	public int getVarDiscount() {
		return varDiscount;
	}

	public void setVarDiscount(int varDiscount) {
		this.varDiscount = varDiscount;
	}

	public boolean isVarIsActive() {
		return varIsActive;
	}

	public void setVarIsActive(boolean varIsActive) {
		this.varIsActive = varIsActive;
	}

	public LocalDateTime getVarCreationTime() {
		return varCreationTime;
	}

	public void setVarCreationTime(LocalDateTime varCreationTime) {
		this.varCreationTime = varCreationTime;
	}

	public LocalDateTime getVarModificationTime() {
		return varModificationTime;
	}

	public void setVarModificationTime(LocalDateTime varModificationTime) {
		this.varModificationTime = varModificationTime;
	}

	@Override
	public String toString() {
		return "ProductVariant [varId=" + varId + ", product=" + product + ", varWeight=" + varWeight + ", varSellPrice="
				+ varSellPrice + ", varPurchasePrice=" + varPurchasePrice + ", varInStock=" + varInStock + ", varDiscount="
				+ varDiscount + ", varIsActive=" + varIsActive + ", varCreationTime=" + varCreationTime
				+ ", varModificationTime=" + varModificationTime + "]";
	}

	
}
