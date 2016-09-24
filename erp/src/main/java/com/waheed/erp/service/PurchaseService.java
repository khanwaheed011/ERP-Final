package com.waheed.erp.service;

import java.util.List;

import com.waheed.erp.model.Purchase;



public interface PurchaseService {
	
public void addPurchase(Purchase p);
public void updatePurchase(Purchase p);
public void removePurchase(int id);
List<Purchase> findByBillNo(long billNo);
Purchase findByPurchaseId(long purchaseId);
List<Purchase> findByProductId(long productId);

}
