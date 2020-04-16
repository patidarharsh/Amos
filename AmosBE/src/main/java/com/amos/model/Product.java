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
@Table(name = "product")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prd_id", nullable = false, unique = true)
	private int prd_id;

	@JoinColumn(name = "ctg_id", referencedColumnName = "ctg_id")
	@OneToOne(cascade = CascadeType.ALL)
	private Category category;
	
	@OneToOne(mappedBy = "product")
	private ProductVariant prdVar;
	
	@OneToOne(mappedBy = "product")
	private HowToUse htu;
	
	@OneToOne(mappedBy = "product")
	private CartDetails cartDetails;
	
	@OneToMany(mappedBy = "product")
	private List<ProductComposition> productComposition;
	
	@Column(name = "prd_by", unique = true)
	private String prdBy;
	
	@Column(name = "prd_name", nullable = false)
	private String prd_name;
	
	@Column(name = "prd_uom", nullable = false)
	private String prd_UOM;
	
	@Column(name = "prd_desc")
	private String prd_desc;
	
	@Column(name = "prd_rating")
	private byte prd_rating;
	
	@Column(name = "prd_img_url")
	private String prdImgUrl;
	
	@Column(name = "prd_is_active")
	private boolean prdIsActive;

	@Column(name = "prd_creation_time")
	private LocalDateTime prdCreationTime;
	
	@Column(name = "prd_modification_time")
	private LocalDateTime prdModificationTime;

	
}
