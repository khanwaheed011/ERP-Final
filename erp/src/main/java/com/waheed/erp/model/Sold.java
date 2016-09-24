package com.waheed.erp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;



@Entity
public class Sold {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long soldId;

@Column(nullable = false, length = 75)
private long productId;

@Column(nullable = false, length = 75)
private long billNo;

@Column(nullable = false, length = 255)
private String soldTo;

@Column(nullable = false, length = 255)
private String deliveredAt;

@Column(length = 75)
private String deliveryChallanNo;

@Column(length = 75)
private String lotNo;

@Column(length = 75)
private String broker;

/*@com.fasterxml.jackson.annotation.JsonIgnore
@ManyToOne(fetch =FetchType.LAZY)
private ProductMaster product;*/

@Column(nullable = false, length = 75)
private long rate;

@Column(nullable = false, length = 75)
private long quantity;

@Column(length = 75)
private long specification;

@Column(nullable = false,length = 75)
private long totalAmount;

@Column(nullable = false,length = 75)
private long advance;

@Column(nullable = false,length = 75)
private long balance;

@CreatedDate
private Date createdOn;

@LastModifiedDate
private Date lastModifiedOn;

/*@JsonIgnore
@CreatedBy
@ManyToOne(fetch = FetchType.LAZY)
private User createdBy;

@JsonIgnore
@LastModifiedBy
@ManyToOne(fetch = FetchType.LAZY)
private User lastModifiedBy;
*/



}
