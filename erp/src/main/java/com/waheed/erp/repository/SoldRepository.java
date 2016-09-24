package com.waheed.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waheed.erp.model.Sold;



public interface SoldRepository extends JpaRepository<Sold, Long> {

	List<Sold> findByBillNo(long billNo);
	List<Sold> findBySoldId(long soldId);
	List<Sold> findByProductId(long productId);
	
	
}
