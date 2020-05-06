package com.amos.service;

import java.util.Map;

import com.amos.dto.ProductRequest;

public interface IHowToUseService {
	public boolean saveHowToUse(ProductRequest prdReq);
	public Map<String, String> getHowToUse(int prdId);
}
