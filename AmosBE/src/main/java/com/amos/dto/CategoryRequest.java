package com.amos.dto;

public class CategoryRequest {
	private String ctgName;
	private boolean ctgIsActive;
	private String ctgImgUrl;
	private String ctgDesc;
	private int ctgId;
	
	@Override
	public String toString() {
		return "CategoryRequest [ctgName=" + ctgName + ", ctgIsActive=" + ctgIsActive + ", ctgImgUrl=" + ctgImgUrl
				+ ", ctgDesc=" + ctgDesc + "]";
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
	public int getCtgId() {
		return ctgId;
	}
	public void setCtgId(int ctgId) {
		this.ctgId = ctgId;
	}
	
	
}
