package com.waheed.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waheed.erp.model.Purchase;


public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

	List<Purchase> findByBillNo(long billNo);
	Purchase findByPurchaseId(long purchaseId);
	List<Purchase> findByProductId(long productId);
	public void addPurchase(Purchase purchase);
	public void updatePurchase(Purchase purchase);
	public void deletePurchase(long purchaseId);
	
}
