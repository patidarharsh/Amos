package com.amos.service.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amos.dao.ProductCategoryDAO;
import com.amos.dto.ProductRequest;
import com.amos.model.ProductCategory;
import com.amos.service.ICategoryService;
import com.amos.service.IProductCategoryService;

@Service
public class ProductCategoryServiceImpl implements IProductCategoryService {
	
	@Autowired
	private ProductCategoryDAO prdCtgDAO;
	
	@Autowired
	private ICategoryService ctgService;

	@Override
	public boolean saveProductCategory(ProductRequest prdReq) {
		System.out.println(prdReq.getPrdCtgList());
		for (int item: prdReq.getPrdCtgList()) {
			ProductCategory prdCtg = new ProductCategory();
			prdCtg.setCategory(ctgService.getCategory(item));
			prdCtg.setProduct(prdReq.getProduct());
			prdCtgDAO.save(prdCtg);
		}
		return true;
	}
	
}
