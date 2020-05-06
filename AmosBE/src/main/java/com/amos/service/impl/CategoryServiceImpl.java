package com.amos.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amos.dao.CategoryDAO;
import com.amos.dao.ProductCategoryDAO;
import com.amos.dto.CategoryRequest;
import com.amos.model.Category;
import com.amos.service.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService{
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private ProductCategoryDAO prdCtgDAO;
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public boolean saveCategory(CategoryRequest ctgReq) {
		Category category = new Category();
		category.setCtgName(ctgReq.getCtgName());
		category.setCtgCreationTime(LocalDateTime.now());
		category.setCtgDesc(ctgReq.getCtgDesc());
		category.setCtgImgUrl(ctgReq.getCtgImgUrl());
		category.setCtgModificationTime(LocalDateTime.now());
		category.setCtgIsActive(ctgReq.isCtgIsActive());
		categoryDAO.save(category);
		return true;
	}

	@Override
	public Category getCategory(int id) {
		Category ctg = categoryDAO.getOne(id);
		return ctg;
	}

	@Override
	public List<Category> getAllCategories() {
		List<Category> list = categoryDAO.findAll();
		return list;
	}

	@Transactional
	@Override
	public boolean updateCategory(CategoryRequest ctg) {
		categoryDAO.updateCategory(ctg.getCtgName(), ctg.isCtgIsActive(), ctg.getCtgImgUrl(), ctg.getCtgDesc(), LocalDateTime.now(), ctg.getCtgId());
		return true;
	}

	@Override
	public List<String> getProductCategories(int prdId) {
		List<String> prdCtgList = new ArrayList<>(); 
		for(int ctgId : prdCtgDAO.getProductCategories(prdId)) {
			prdCtgList.add(categoryDAO.getOne(ctgId).getCtgName());
		}
		return prdCtgList;
	}

}
