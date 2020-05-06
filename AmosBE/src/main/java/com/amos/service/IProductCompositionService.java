package com.amos.service;

import java.util.Map;

import com.amos.dto.ProductRequest;

public interface IProductCompositionService {
	public boolean saveProductComposition(ProductRequest prdReq);
	public Map<String, Double> getProductComposition(int prdId); 
}
