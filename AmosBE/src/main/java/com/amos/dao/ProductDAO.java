package com.amos.dao;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.amos.model.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {
	
	@Query("Select prd from Product prd where prd.prdName LIKE %?1")
	public Product getProductByName(String productName);
	
	@Modifying
	@Query("UPDATE Product prd set prd.prdName = ?1, prd.prdUOM = ?2, prd.prdDesc = ?3, prd.prdRating = ?4, prd.prdImgUrl = ?5, prd.prdIsActive = ?6, prd.prdModificationTime = ?7 where prd.prdId = ?8")
	public void updateProduct(String prdName, String prdUOM, String prdDesc, byte prdRating, String prdImgUrl, boolean prdIsActive,LocalDateTime prdModificationTime, int prdId);
}
