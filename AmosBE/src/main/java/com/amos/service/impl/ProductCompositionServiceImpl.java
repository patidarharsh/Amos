package com.amos.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amos.dao.ProductCompositionDAO;
import com.amos.dto.ProductRequest;
import com.amos.model.Product;
import com.amos.model.ProductComposition;
import com.amos.service.IProductCompositionService;

@Service
public class ProductCompositionServiceImpl implements IProductCompositionService{
	
	@Autowired
	private ProductCompositionDAO prdCmpDAO;

	@Override
	public boolean saveProductComposition(ProductRequest prdReq) {
		for (Map.Entry<String,Double> item : prdReq.getPrdComposition().entrySet()) {
			ProductComposition prdCmp = new ProductComposition();
			prdCmp.setIngredient(item.getKey());
			prdCmp.setQty(item.getValue());
			prdCmp.setProduct(prdReq.getProduct());
			prdCmpDAO.save(prdCmp);
		}
		return true;
	}

	@Override
	public Map<String, Double> getProductComposition(int prdId) {
		Map<String,Double> prdCmpMap = new HashMap<>();
		for(ProductComposition prdCmp : prdCmpDAO.getAllById(prdId)) {
			prdCmpMap.put(prdCmp.getIngredient(), prdCmp.getQty());
		}		
		return prdCmpMap;
	}
	
	
}
