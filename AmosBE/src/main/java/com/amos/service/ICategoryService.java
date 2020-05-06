package com.amos.service;

import java.util.List;

import com.amos.dto.CategoryRequest;
import com.amos.model.Category;

public interface ICategoryService {
	public boolean saveCategory(CategoryRequest ctg);
	public Category getCategory(int id);
	public List<Category> getAllCategories();
	public boolean updateCategory(CategoryRequest ctg);
	public List<String> getProductCategories(int prdId);
}
