package com.Test.smallH2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServicesImpl {
	
	@Autowired
	private CarRepository carRepository;
	
//	public Car findOneCar(Long id) {
//		return carRepository.findACar(id);
//	}

	public void insertCar(Car car) {
	carRepository.save(car);
	}
	
	public void deleteCar(Car car) {
	carRepository.delete(car);
	}

}
