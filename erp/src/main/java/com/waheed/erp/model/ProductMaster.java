package com.waheed.erp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ProductMaster {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long productId;
	
@Column(nullable = false, length = 75)
private String productName;

@Column(nullable = true, length = 255)
private String productDescription;

@Column(nullable = true, length = 75)
private long rate;

public ProductMaster() {
		super();
	}

public ProductMaster(String productName, String productDescription) {
	super();
	this.productName = productName;
	this.productDescription = productDescription;
}



}
