package com.amos.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_category")
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prdCatId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ctg_id",referencedColumnName = "ctg_id")
	private Category category;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "prd_id", referencedColumnName = "prd_id")
	private Product product;

	public int getPrdCatId() {
		return prdCatId;
	}

	public void setPrdCatId(int prdCatId) {
		this.prdCatId = prdCatId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ProductCategory [prdCatId=" + prdCatId + ", category=" + category + ", product=" + product + "]";
	}

	
}
