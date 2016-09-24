package com.waheed.erp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

/*
 * 
 *  @author waheed
 * 
 */

@Entity
@Table(name="Purchase")
public class Purchase {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int purchaseId;

@Column(nullable = false, length = 75)
private long billNo;

@Column(nullable = false, length = 255)
private String purchaseFrom;

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
private String specification;

@Column(nullable = false,length = 75)
private long totalAmount;

public long getPurchaseId() {
	return purchaseId;
}

public void setPurchaseId(int purchaseId) {
	this.purchaseId = purchaseId;
}

public long getBillNo() {
	return billNo;
}

public void setBillNo(long billNo) {
	this.billNo = billNo;
}

public String getPurchaseFrom() {
	return purchaseFrom;
}

public void setPurchaseFrom(String purchaseFrom) {
	this.purchaseFrom = purchaseFrom;
}

public String getDeliveredAt() {
	return deliveredAt;
}

public void setDeliveredAt(String deliveredAt) {
	this.deliveredAt = deliveredAt;
}

public String getDeliveryChallanNo() {
	return deliveryChallanNo;
}

public void setDeliveryChallanNo(String deliveryChallanNo) {
	this.deliveryChallanNo = deliveryChallanNo;
}

public String getLotNo() {
	return lotNo;
}

public void setLotNo(String lotNo) {
	this.lotNo = lotNo;
}

public String getBroker() {
	return broker;
}

public void setBroker(String broker) {
	this.broker = broker;
}

public long getRate() {
	return rate;
}

public void setRate(long rate) {
	this.rate = rate;
}

public long getQuantity() {
	return quantity;
}

public void setQuantity(long quantity) {
	this.quantity = quantity;
}

public String getSpecification() {
	return specification;
}

public void setSpecification(String specification) {
	this.specification = specification;
}

public long getTotalAmount() {
	return totalAmount;
}

public void setTotalAmount(long totalAmount) {
	this.totalAmount = totalAmount;
}

public long getAdvance() {
	return advance;
}

public void setAdvance(long advance) {
	this.advance = advance;
}

public long getBalance() {
	return balance;
}

public void setBalance(long balance) {
	this.balance = balance;
}

public Date getCreatedOn() {
	return createdOn;
}

public void setCreatedOn(Date createdOn) {
	this.createdOn = createdOn;
}

public Date getLastModifiedOn() {
	return lastModifiedOn;
}

public void setLastModifiedOn(Date lastModifiedOn) {
	this.lastModifiedOn = lastModifiedOn;
}

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
private User lastModifiedBy;*/




}
