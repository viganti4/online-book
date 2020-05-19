package com.cg.project.onlinebookstore.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_book")
@Setter
@Getter
@ToString
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String sku;
	
	private String name;
	
	private String description;
	
	@Column(name="unit_price")
	private BigDecimal unitPrice;
	
	@Column(name="image_url")
	private String imageUrl;
	
	private boolean active;
	
	@Column(name="units_in_stock")
	private int unitsInStock;
	
	@Column(name="date_created")
	private Date createdOn;
	
	@Column(name="date_updated")
	private Date updatedOn;
	
	@ManyToMany
	@JoinColumn(name="category_id", nullable=false)
	private BookCategory category;
	

}
