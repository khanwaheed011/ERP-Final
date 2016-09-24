package com.waheed.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waheed.erp.model.ProductMaster;




public interface ProductMasterRepository extends JpaRepository<ProductMaster, Long> {

	ProductMaster findByProductId(String productId);
	
	
	
	
}
