package com.Test.smallH2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CarRepository extends CrudRepository<Car,Long> {
	
//	public Car findACar(Long id); 
}