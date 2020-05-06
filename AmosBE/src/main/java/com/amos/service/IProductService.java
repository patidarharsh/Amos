package com.amos.service;

import java.util.List;

import com.amos.dto.ProductRequest;
import com.amos.dto.ProductResponse;
import com.amos.model.Product;

public interface IProductService {
	public boolean saveProduct(ProductRequest prd);
	public List<Product> getAllProducts();
	public Product getProductByName(String prdName);
	public boolean updateProduct(ProductRequest prdReq);
	public ProductResponse getProductDetail(int prdId);
}
