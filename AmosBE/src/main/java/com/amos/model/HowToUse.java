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
@Table(name = "how_to_use")
public class HowToUse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "htu_id", nullable = false, unique = true)
	private int htuId;
	
	@JoinColumn(name = "prd_id", referencedColumnName = "prd_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private Product product;
	
	@Column(name = "disease", nullable = false)
	private String disease;
	
	@Column(name = "how_to_use", nullable = false)
	private String howToUse;
	
	@Column(name = "htu_creation_time")
	private LocalDateTime htuCreationDate;
	
	@Column(name = "htu_modificaition_time")
	private LocalDateTime htuModificationTime;

	public int getHtuId() {
		return htuId;
	}

	public void setHtuId(int htuId) {
		this.htuId = htuId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getHowToUse() {
		return howToUse;
	}

	public void setHowToUse(String howToUse) {
		this.howToUse = howToUse;
	}

	public LocalDateTime getHtuCreationDate() {
		return htuCreationDate;
	}

	public void setHtuCreationDate(LocalDateTime htuCreationDate) {
		this.htuCreationDate = htuCreationDate;
	}

	public LocalDateTime getHtuModificationTime() {
		return htuModificationTime;
	}

	public void setHtuModificationTime(LocalDateTime htuModificationTime) {
		this.htuModificationTime = htuModificationTime;
	}

	@Override
	public String toString() {
		return "HowToUse [htuId=" + htuId + ", product=" + product + ", disease=" + disease + ", howToUse=" + howToUse
				+ ", htuCreationDate=" + htuCreationDate + ", htuModificationTime=" + htuModificationTime + "]";
	}

	
}
