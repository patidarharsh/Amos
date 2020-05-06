package com.amos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.amos.model.ProductComposition;

@Repository
public interface ProductCompositionDAO extends JpaRepository<ProductComposition, Integer> {
	
	@Query(value = "SELECT * from product_composition prdCmp where prdCmp.prd_id = ?1", nativeQuery = true)
	public List<ProductComposition> getAllById(int prdId);
	
}
