package com.Test.smallH2;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
	@Table(name="CAR")
//	@Table
	public class Car {

		@Id
//		@GeneratedValue(strategy=GenerationType.TABLE)
//		@GeneratedValue(strategy=GenerationType.SEQUENCE)
//		@GeneratedValue(strategy=GenerationType.IDENTITY)
//		@GeneratedValue(strategy=GenerationType.AUTO)
//		@SequenceGenerator(name = "MySequence", sequenceName = "my_seq", allocationSize=1)
//		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MySequence")
		private Long id;
		private String model;

		
//		@ManyToOne(fetch = FetchType.LAZY)
		@ManyToOne
		@JoinColumn(name="ID_CATEGORY")
		@JsonManagedReference
		private Category categoryid;


		public Car() {
			super();
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getModel() {
			return model;
		}


		public void setModel(String model) {
			this.model = model;
		}


		public Category getCategory() {
			return categoryid;
		}


		public void setCategory(Category category) {
			this.categoryid = category;
		}


	
		
		
}

