package com.amos.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ctg_id", nullable = false, unique = true)
	private int ctgId;
	
	@OneToOne(mappedBy = "category")
	private Product product;
	
	@Column(name = "ctg_name", nullable = false)
	private String ctgName;
	
	@Column(name = "ctg_is_active", nullable = false)
	private boolean ctgIsActive;
	
	@Column(name = "ctg_img_url")
	private String ctgImgUrl;
	
	@Column(name = "ctg_desc")
	private String ctgDesc;
	
	@Column(name = "ctg_creation_time")
	private LocalDateTime ctgCreationTime;
	
	@Column(name = "ctg_modification_time")
	private LocalDateTime ctgModificationTime;

	public int getCtgId() {
		return ctgId;
	}

	public void setCtgId(int ctgId) {
		this.ctgId = ctgId;
	}

	public String getCtgName() {
		return ctgName;
	}

	public void setCtgName(String ctgName) {
		this.ctgName = ctgName;
	}

	public boolean isCtgIsActive() {
		return ctgIsActive;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setCtgIsActive(boolean ctgIsActive) {
		this.ctgIsActive = ctgIsActive;
	}

	public String getCtgImgUrl() {
		return ctgImgUrl;
	}

	public void setCtgImgUrl(String ctgImgUrl) {
		this.ctgImgUrl = ctgImgUrl;
	}

	public String getCtgDesc() {
		return ctgDesc;
	}

	public void setCtgDesc(String ctgDesc) {
		this.ctgDesc = ctgDesc;
	}

	public LocalDateTime getCtgCreationTime() {
		return ctgCreationTime;
	}

	public void setCtgCreationTime(LocalDateTime ctgCreationTime) {
		this.ctgCreationTime = ctgCreationTime;
	}

	public LocalDateTime getCtgModificationTime() {
		return ctgModificationTime;
	}

	public void setCtgModificationTime(LocalDateTime ctgModificationTime) {
		this.ctgModificationTime = ctgModificationTime;
	}

	@Override
	public String toString() {
		return "Category [ctgId=" + ctgId + ", product=" + product + ", ctgName=" + ctgName + ", ctgIsActive="
				+ ctgIsActive + ", ctgImgUrl=" + ctgImgUrl + ", ctgDesc=" + ctgDesc + ", ctgCreationTime="
				+ ctgCreationTime + ", ctgModificationTime=" + ctgModificationTime + "]";
	}

}
