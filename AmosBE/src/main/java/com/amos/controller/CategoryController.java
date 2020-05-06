package com.amos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amos.dto.CategoryRequest;
import com.amos.service.ICategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private ICategoryService categoryService;
	
	@PostMapping
	public ResponseEntity<?> saveCategory(@RequestBody CategoryRequest ctgReq){
		return ResponseEntity.ok(categoryService.saveCategory(ctgReq));
	}
	
	@GetMapping
	public ResponseEntity<?> getAllCategories(){
		return ResponseEntity.ok(categoryService.getAllCategories());
	}
	
	@PutMapping
	public ResponseEntity<?> updateCategory(@RequestBody CategoryRequest ctgReq){
		System.out.println(ctgReq);
		categoryService.updateCategory(ctgReq);
		return new ResponseEntity<String>("Done", HttpStatus.CREATED);
	}
}