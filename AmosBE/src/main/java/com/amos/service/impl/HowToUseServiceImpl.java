package com.amos.service.impl;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amos.dao.HowToUseDAO;
import com.amos.dto.ProductRequest;
import com.amos.model.HowToUse;
import com.amos.service.IHowToUseService;

@Service
public class HowToUseServiceImpl implements IHowToUseService {
	
	@Autowired
	private HowToUseDAO htuDAO;

	@Override
	public boolean saveHowToUse(ProductRequest prdReq) {
		for(Map.Entry<String, String> item : prdReq.getHowToUse().entrySet()) {
			HowToUse htu = new HowToUse();
			htu.setDisease(item.getKey());
			htu.setHowToUse(item.getValue());
			htu.setHtuCreationDate(LocalDateTime.now());
			htu.setHtuModificationTime(LocalDateTime.now());
			htu.setProduct(prdReq.getProduct());
			htuDAO.save(htu);
		}		
		return true;
	}

	@Override
	public Map<String, String> getHowToUse(int prdId) {
		Map<String, String> htuMap = new HashMap<>();
		for(HowToUse htu : htuDAO.getHowToUse(prdId)) {
			htuMap.put(htu.getDisease(), htu.getHowToUse());
		}
		return htuMap;
	}
}
