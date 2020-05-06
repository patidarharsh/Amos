package com.amos.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.amos.model.Product;
import com.amos.model.ProductVariant;

public class ProductResponse {
	private int prdId;
	private String prdBy;
	private String prdName;
	private String prdUOM;
	private String prdDesc;
	private byte prdRating;
	private String prdImgUrl;
	private boolean prdIsActive;
	private LocalDateTime prdCreationTime;
	private LocalDateTime prdModificationTime;
	private List<ProductVariant> prdVariants;
	private Map<String,Double> prdComposition;
	private Map<String,String> howToUse;
	private List<String> prdCtgList;

	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
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
	public List<ProductVariant> getPrdVariants() {
		return prdVariants;
	}
	public void setPrdVariants(List<ProductVariant> prdVariants) {
		this.prdVariants = prdVariants;
	}
	public Map<String, Double> getPrdComposition() {
		return prdComposition;
	}
	public void setPrdComposition(Map<String, Double> prdComposition) {
		this.prdComposition = prdComposition;
	}
	public Map<String, String> getHowToUse() {
		return howToUse;
	}
	public void setHowToUse(Map<String, String> howToUse) {
		this.howToUse = howToUse;
	}
	public List<String> getPrdCtgList() {
		return prdCtgList;
	}
	public void setPrdCtgList(List<String> prdCtgList) {
		this.prdCtgList = prdCtgList;
	}

	@Override
	public String toString() {
		return "ProductResponse [prdId=" + prdId + ", prdBy=" + prdBy + ", prdName=" + prdName
				+ ", prdUOM=" + prdUOM + ", prdDesc=" + prdDesc + ", prdRating=" + prdRating + ", prdImgUrl="
				+ prdImgUrl + ", prdIsActive=" + prdIsActive + ", prdCreationTime=" + prdCreationTime
				+ ", prdModificationTime=" + prdModificationTime + ", prdVariants=" + prdVariants + ", prdComposition="
				+ prdComposition + ", howToUse=" + howToUse + ", prdCtgList=" + prdCtgList 
				+ "]";
	}
	
	
}
