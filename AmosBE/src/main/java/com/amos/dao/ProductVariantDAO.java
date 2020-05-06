package com.amos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.amos.model.ProductVariant;

public interface ProductVariantDAO extends JpaRepository<ProductVariant, Integer>{
	
	@Query(value = "SELECT * from product_variant prdVar where prdVar.prd_id = ?1", nativeQuery = true)
	public List<ProductVariant> getProductVariant(int prdId);
}
