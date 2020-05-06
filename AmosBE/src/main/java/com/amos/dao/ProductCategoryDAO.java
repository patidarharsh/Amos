package com.amos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.amos.model.ProductCategory;

@Repository
public interface ProductCategoryDAO extends JpaRepository<ProductCategory, Integer> {
	
	@Query(value = "SELECT * from product_category prdCtg where prdCtg.prd_id = ?1", nativeQuery = true)
	public List<Integer> getProductCategories(int prdId);
}
