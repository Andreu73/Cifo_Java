package com.Test.smallH2;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CategoryRepository extends CrudRepository<Category, Long> {

//	public Category findByIdNumber(Long id);
	
}