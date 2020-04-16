package com.amos.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "how_to_use")
public class HowToUse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "htu_id", nullable = false, unique = true)
	private int htuId;
	
	@JoinColumn(name = "prd_id", referencedColumnName = "prd_id")
	@OneToOne(cascade = CascadeType.ALL)
	private Product product;
	
	@Column(name = "disease", nullable = false)
	private String disease;
	
	@Column(name = "how_to_use", nullable = false)
	private String howToUse;
	
	@Column(name = "htu_creation_time")
	private LocalDateTime htuCreationDate;
	
	@Column(name = "htu_modificaition_time")
	private LocalDateTime htuModificationTime;

	
}
