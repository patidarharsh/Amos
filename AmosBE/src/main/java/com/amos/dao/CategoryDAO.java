package com.amos.dao;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.amos.model.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer> {

	@Modifying
	@Query("update Category ctg set ctg.ctgName = ?1, ctg.ctgIsActive = ?2, ctg.ctgImgUrl = ?3, ctg.ctgDesc = ?4, ctg.ctgModificationTime = ?5 where ctg.ctgId = ?6")
	public void updateCategory(String ctgName, boolean isCtgActive, String ctgImgUrl, String ctgDesc, LocalDateTime prdModificationTime, int ctgId);
}
