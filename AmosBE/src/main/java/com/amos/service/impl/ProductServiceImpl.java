package com.amos.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amos.model.Category;
import com.amos.model.Product;
import com.amos.dao.ProductDAO;
import com.amos.dto.ProductRequest;
import com.amos.dto.ProductResponse;
import com.amos.service.ICategoryService;
import com.amos.service.IHowToUseService;
import com.amos.service.IProductCategoryService;
import com.amos.service.IProductCompositionService;
import com.amos.service.IProductService;
import com.amos.service.IProductVariantService;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductDAO productDAO;

	@Autowired
	private IProductVariantService prdVarService;

	@Autowired
	private IProductCompositionService prdCmpService;

	@Autowired
	private IHowToUseService htuService;

	@Autowired
	private ICategoryService ctgService;

	@Autowired
	private IProductCategoryService prdCtgService;

	@Transactional
	@Override
	public boolean saveProduct(ProductRequest prdReq) {
		Product product = new Product();
		product.setPrdId(prdReq.getPrdId());
		product.setPrdBy(prdReq.getPrdBy());
		product.setPrdCreationTime(LocalDateTime.now());
		product.setPrdDesc(prdReq.getPrdDesc());
		product.setPrdImgUrl(prdReq.getPrdImgUrl());
		product.setPrdIsActive(prdReq.isPrdIsActive());
		product.setPrdModificationTime(LocalDateTime.now());
		product.setPrdName(prdReq.getPrdName());
		product.setPrdRating(prdReq.getPrdRating());
		product.setPrdUOM(prdReq.getPrdUOM());
		productDAO.save(product);
		prdReq.setProduct(product);

		// save categories of the product
		prdCtgService.saveProductCategory(prdReq);

		// save variant of product
		prdVarService.saveProductVariant(prdReq);

		// save product composition
		prdCmpService.saveProductComposition(prdReq);

		// save how to use
		htuService.saveHowToUse(prdReq);
		return true;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> list = new ArrayList<>();
		list = productDAO.findAll();
		return list;
	}

	@Override
	public Product getProductByName(String prdName) {
		return productDAO.getProductByName(prdName);
	}

	@Transactional
	@Override
	public boolean updateProduct(ProductRequest prdReq) {
		productDAO.updateProduct(prdReq.getPrdName(), prdReq.getPrdUOM(), prdReq.getPrdDesc(), prdReq.getPrdRating(),
				prdReq.getPrdImgUrl(), prdReq.isPrdIsActive(), LocalDateTime.now(), prdReq.getPrdId());
		return true;
	}

	@Override
	public ProductResponse getProductDetail(int prdId) {
		Product prd = productDAO.getOne(prdId);
		ProductResponse prdResp = new ProductResponse();
		prdResp.setPrdBy(prd.getPrdBy());
		prdResp.setPrdCreationTime(prd.getPrdCreationTime());
		prdResp.setPrdDesc(prd.getPrdDesc());
		prdResp.setPrdId(prd.getPrdId());
		prdResp.setPrdImgUrl(prd.getPrdImgUrl());
		prdResp.setPrdIsActive(prd.isPrdIsActive());
		prdResp.setPrdModificationTime(prd.getPrdModificationTime());
		prdResp.setPrdName(prd.getPrdName());
		prdResp.setPrdRating(prd.getPrdRating());
		prdResp.setPrdUOM(prd.getPrdUOM());
		prdResp.setPrdComposition(prdCmpService.getProductComposition(prdId));
		prdResp.setHowToUse(htuService.getHowToUse(prdId));
		prdResp.setPrdVariants(prdVarService.getProductVariant(prdId));
		prdResp.setPrdCtgList(ctgService.getProductCategories(prdId));
		return prdResp;
	}

}
