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
	private double qty;

	public int getPrdCmpId() {
		return prdCmpId;
	}

	public void setPrdCmpId(int prdCmpId) {
		this.prdCmpId = prdCmpId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "ProductComposition [prdCmpId=" + prdCmpId + ", product=" + product + ", ingredient=" + ingredient
				+ ", qty=" + qty + "]";
	}
	
	
}
