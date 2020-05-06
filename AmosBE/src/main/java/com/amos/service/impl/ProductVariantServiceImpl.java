package com.amos.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amos.dao.ProductVariantDAO;
import com.amos.dto.ProductRequest;
import com.amos.model.Product;
import com.amos.model.ProductVariant;
import com.amos.service.IHowToUseService;
import com.amos.service.IProductCompositionService;
import com.amos.service.IProductService;
import com.amos.service.IProductVariantService;

@Service
public class ProductVariantServiceImpl implements IProductVariantService {
	
	@Autowired
	private ProductVariantDAO prdVarDAO;
	


	@Override
	public boolean saveProductVariant(ProductRequest prdReq) {
		List<ProductVariant> list = prdReq.getPrdVariants();
		for (ProductVariant productVariant : list) {
			ProductVariant prdVar = new ProductVariant();
			prdVar.setVarSellPrice(productVariant.getVarSellPrice());
			prdVar.setVarCreationTime(LocalDateTime.now());
			prdVar.setVarDiscount(productVariant.getVarDiscount());
			prdVar.setVarInStock(productVariant.getVarInStock());
			prdVar.setVarIsActive(productVariant.isVarIsActive());
			prdVar.setVarModificationTime(LocalDateTime.now());
			prdVar.setVarPurchasePrice(productVariant.getVarPurchasePrice());
			prdVar.setVarWeight(productVariant.getVarWeight());
			prdVar.setProduct(prdReq.getProduct());
			prdVarDAO.save(prdVar);
		}		
		return true;
	}



	@Override
	public List<ProductVariant> getProductVariant(int prdId) {
		return prdVarDAO.getProductVariant(prdId);
	}

}
