package com.waheed.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.waheed.erp.dao.PurchaseDAO;
import com.waheed.erp.model.Purchase;
import com.waheed.erp.repository.PurchaseRepository;
import com.waheed.erp.service.PurchaseService;


@Service
public class PurchaseServiceImpl implements PurchaseService{

	private PurchaseDAO purchaseDAO;
	
	public void setPurchaseDAO(PurchaseDAO purchaseDAO) {
		this.purchaseDAO = purchaseDAO;
	}


@Transactional
	public void addPurchase(Purchase p) {
		this.purchaseDAO.addPurchase(p);
	}

@Transactional
	public void updatePurchase(Purchase p) {
	this.purchaseDAO.updatePurchase(p);
	}

@Transactional
	public void removePurchase(int id) {
		this.removePurchase(id);
	}

@Transactional
	public List<Purchase> findByProductId(long productId) {
		return this.purchaseDAO.findByProductId(productId);
	}
	
	
	
	
	
	
	
	
	
	@Autowired
	PurchaseRepository purchaseRepository;
	
	public Purchase findByPurchaseId(long purchaseId) {
		return purchaseRepository.findByPurchaseId(purchaseId);
	}
	
	public List<Purchase> findByBillNo(long billNo) {
		return purchaseRepository.findByBillNo(billNo);
	}

	public List<Purchase> findByproductId(long productId) {
		return purchaseRepository.findByProductId(productId);
	}


    

	
	

}
