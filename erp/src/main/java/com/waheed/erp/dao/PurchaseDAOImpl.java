package com.waheed.erp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.waheed.erp.model.Purchase;

@Repository
public class PurchaseDAOImpl implements PurchaseDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PurchaseDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addPurchase(Purchase p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Purchase saved successfully, Purchase Details="+p);
	}

	public void updatePurchase(Purchase p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Purchase updated successfully, Purchase Details="+p);
	}

	public void removePurchase(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Purchase p = (Purchase) session.load(Purchase.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Purchase deleted successfully, person details="+p);
		
	}

	public List<Purchase> findByBillNo(long billNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public Purchase findByPurchaseId(long purchaseId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Purchase> findByProductId(long productId) {
		// TODO Auto-generated method stub
		return null;
	}



}
