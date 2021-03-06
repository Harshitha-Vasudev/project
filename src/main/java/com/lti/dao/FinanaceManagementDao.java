package com.lti.dao;

import java.util.List;

import com.lti.model.Customer;
import com.lti.model.Emi;
import com.lti.model.EmiPayment;
import com.lti.model.Login;

public interface FinanaceManagementDao {
	public int createCustomer(Login login);
	public List<Customer> viewAllCustomer();
	public List<Emi> viewAllEmiByCustomer(int customerId);
	public int productMonthlyPayment(EmiPayment emiPayment);
}
