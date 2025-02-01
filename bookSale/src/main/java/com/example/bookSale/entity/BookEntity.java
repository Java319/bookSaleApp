package com.example.bookSale.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TableBooks")
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;   
	 private String brand;       
	    private String model;        
	    private Integer year;        
	    private Double price;
	    private LocalDate publishDate;
	    public Long getId() {
			return id;
		}
	    
	    
	    
	    
		public BookEntity(Long id, String brand, String model, Integer year, Double price, LocalDate publishDate) {
			super();
			this.id = id;
			this.brand = brand;
			this.model = model;
			this.year = year;
			this.price = price;
			this.publishDate = publishDate;
		}
		public BookEntity() {}




		public void setId( Long id) {
			this.id = id;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public Integer getYear() {
			return year;
		}
		public void setYear(Integer year) {
			this.year = year;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		public LocalDate getPublishDate() {
			return publishDate;
		}
		public void setPublishDate(LocalDate publishDate) {
			this.publishDate = publishDate;
		}
	    
	    
	    
	    
	    
	    
}
