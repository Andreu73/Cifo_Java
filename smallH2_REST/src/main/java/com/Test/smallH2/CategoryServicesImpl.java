package com.Test.smallH2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServicesImpl {

	@Autowired
	private CategoryRepository categoryRepository;

//	public Iterable<Category> getCategory() {
//		return categoryRepository.findAll();
//	}

	public void insertCate(Category cate) {
		categoryRepository.save(cate);
	}

	public void deleteCate(Category cate) {
	categoryRepository.delete(cate);
	}



}
