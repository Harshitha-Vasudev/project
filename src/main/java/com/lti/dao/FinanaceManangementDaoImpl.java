package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Customer;
import com.lti.model.Emi;
import com.lti.model.EmiPayment;
import com.lti.model.Login;

@Repository("dao")
public class FinanaceManangementDaoImpl implements FinanaceManagementDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	@Transactional
	public int createCustomer(Login login) {
		entityManager.persist(login);
		return 1;
	}

	@Override
	public List<Customer> viewAllCustomer() {
		String jpql = "From Customer c";
		TypedQuery<Customer> tQuery = entityManager.createQuery(jpql, Customer.class);
		
		return tQuery.getResultList();
	}

	@Override
	@Transactional
	public int productMonthlyPayment(EmiPayment emiPayment) {
		entityManager.persist(emiPayment);
		return 1;
	}

	@Override
	public List<Emi> viewAllEmiByCustomer(int customerId) {
		String jpql = "Select e From Emi e join e.customer cust where cust.customerId = :customerId";
		TypedQuery<Emi> tQuery = entityManager.createNamedQuery(jpql, Emi.class);
		tQuery.setParameter("customerId", customerId);
		return tQuery.getResultList();
	}
	
	
	
}
