package com.amos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.amos.model.HowToUse;

@Repository
public interface HowToUseDAO extends JpaRepository<HowToUse, Integer> {
	
	@Query(value = "SELECT * FROM how_to_use htu where htu.prd_id = ?1", nativeQuery = true)
	public List<HowToUse> getHowToUse(int prdId);
	
}
