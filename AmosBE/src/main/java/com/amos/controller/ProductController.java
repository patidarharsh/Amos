package com.amos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amos.dto.ProductRequest;
import com.amos.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@PostMapping
	public ResponseEntity<?> saveProduct(@RequestBody ProductRequest prdReq){
		System.out.println(prdReq);
		return ResponseEntity.ok(productService.saveProduct(prdReq));
	}
	
	@GetMapping
	public ResponseEntity<?> getAllProduct(){
		return ResponseEntity.ok(productService.getAllProducts());
	}
	
	@GetMapping("/{prdId}")
	public ResponseEntity<?> getProductByName(@PathVariable int prdId){
		return new ResponseEntity<>(productService.getProductDetail(prdId),HttpStatus.ACCEPTED);
	}
	
	@PutMapping
	public ResponseEntity<?> updateProduct(@RequestBody ProductRequest prdReq){
		return new ResponseEntity<>(productService.updateProduct(prdReq),HttpStatus.ACCEPTED);
	}
}
