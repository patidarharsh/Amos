package com.amos.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prd_id", nullable = false, unique = true)
	private int prdId;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	private List<ProductCategory> prdCtgs;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	private List<ProductVariant> prdVar;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	private List<HowToUse> htu;
	
	@JsonIgnore
	@OneToOne(mappedBy = "product")
	private CartDetails cartDetails;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	private List<ProductComposition> productComposition;
	
	@Column(name = "prd_by", nullable = false)
	private String prdBy;
	
	@Column(name = "prd_name", nullable = false, unique = true)
	private String prdName;
	
	@Column(name = "prd_uom", nullable = false)
	private String prdUOM;
	
	@Column(name = "prd_desc")
	private String prdDesc;
	
	@Column(name = "prd_rating")
	private byte prdRating;
	
	@Column(name = "prd_img_url")
	private String prdImgUrl;
	
	@Column(name = "prd_is_active", nullable = false)
	private boolean prdIsActive;

	@Column(name = "prd_creation_time")
	private LocalDateTime prdCreationTime;
	
	@Column(name = "prd_modification_time")
	private LocalDateTime prdModificationTime;

	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public List<ProductVariant> getPrdVar() {
		return prdVar;
	}

	public void setPrdVar(List<ProductVariant> prdVar) {
		this.prdVar = prdVar;
	}

	

	public List<HowToUse> getHtu() {
		return htu;
	}

	public void setHtu(List<HowToUse> htu) {
		this.htu = htu;
	}

	public CartDetails getCartDetails() {
		return cartDetails;
	}

	public void setCartDetails(CartDetails cartDetails) {
		this.cartDetails = cartDetails;
	}

	public List<ProductComposition> getProductComposition() {
		return productComposition;
	}

	public void setProductComposition(List<ProductComposition> productComposition) {
		this.productComposition = productComposition;
	}

	public String getPrdBy() {
		return prdBy;
	}

	public void setPrdBy(String prdBy) {
		this.prdBy = prdBy;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public String getPrdUOM() {
		return prdUOM;
	}

	public void setPrdUOM(String prdUOM) {
		this.prdUOM = prdUOM;
	}

	public String getPrdDesc() {
		return prdDesc;
	}

	public void setPrdDesc(String prdDesc) {
		this.prdDesc = prdDesc;
	}

	public byte getPrdRating() {
		return prdRating;
	}

	public void setPrdRating(byte prdRating) {
		this.prdRating = prdRating;
	}

	public String getPrdImgUrl() {
		return prdImgUrl;
	}

	public void setPrdImgUrl(String prdImgUrl) {
		this.prdImgUrl = prdImgUrl;
	}

	public boolean isPrdIsActive() {
		return prdIsActive;
	}

	public void setPrdIsActive(boolean prdIsActive) {
		this.prdIsActive = prdIsActive;
	}

	public LocalDateTime getPrdCreationTime() {
		return prdCreationTime;
	}

	public void setPrdCreationTime(LocalDateTime prdCreationTime) {
		this.prdCreationTime = prdCreationTime;
	}

	public LocalDateTime getPrdModificationTime() {
		return prdModificationTime;
	}

	public void setPrdModificationTime(LocalDateTime prdModificationTime) {
		this.prdModificationTime = prdModificationTime;
	}

	@Override
	public String toString() {
		return "Product [prdId=" + prdId  + ", prdVar=" + prdVar + ", htu=" + htu
				+ ", cartDetails=" + cartDetails + ", productComposition=" + productComposition + ", prdBy=" + prdBy
				+ ", prdName=" + prdName + ", prdUOM=" + prdUOM + ", prdDesc=" + prdDesc + ", prdRating=" + prdRating
				+ ", prdImgUrl=" + prdImgUrl + ", prdIsActive=" + prdIsActive + ", prdCreationTime=" + prdCreationTime
				+ ", prdModificationTime=" + prdModificationTime + "]";
	}
	
}
