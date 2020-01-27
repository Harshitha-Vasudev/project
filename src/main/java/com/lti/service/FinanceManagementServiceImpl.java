package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.FinanaceManagementDao;
import com.lti.model.Customer;
import com.lti.model.Emi;
import com.lti.model.EmiPayment;
import com.lti.model.Login;

@Service("service")
public class FinanceManagementServiceImpl implements FinanaceManagementService {

	@Autowired
	FinanaceManagementDao dao;
	
	@Override
	public boolean addCustomer(Login login) {
		int result = dao.createCustomer(login);
		
		if(result == 1){
			return true;
		}
		else{
			return false;
		}
	
	}

	@Override
	public List<Customer> findAllCustomer() {
		return null;
	}

	public boolean updateMonthlyPayment(EmiPayment emiPayment){
		int result=dao.productMonthlyPayment(emiPayment);
		
		if(result==1){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public List<Emi> findAllEmiByCustomer(int customerId) {
		
		return dao.viewAllEmiByCustomer(customerId);
	}
}
