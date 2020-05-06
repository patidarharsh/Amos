package com.amos.service;

import java.util.List;

import com.amos.dto.ProductRequest;
import com.amos.model.ProductVariant;

public interface IProductVariantService {
	public boolean saveProductVariant(ProductRequest prdReq);
	public List<ProductVariant> getProductVariant(int prdId);
}
