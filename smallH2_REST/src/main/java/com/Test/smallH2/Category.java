package com.Test.smallH2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="CATEGORY")
//@Table
public class Category {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "MySequence", sequenceName = "my_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MySequence")
	private Long categoryid;
	private String name;
	
	@OneToMany(mappedBy = "categoryid", cascade=CascadeType.ALL)
			
//, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JsonBackReference
	private List<Car> cars = new ArrayList<Car>();
	
	public Category() {
		
		
	}


	public Long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Car> getCars() {
		return cars;
	}



	public void addCar(Car car) {
	cars.add(car);
	car.setCategory(this);
}


	@Override
	public String toString() {
		return "Category [categoryid=" + categoryid + ", name=" + name + ", cars=" + cars + "]";
	}
	
	

}