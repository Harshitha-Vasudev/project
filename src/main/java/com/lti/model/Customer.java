package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("customer")
@Scope(scopeName="prototype")
@Entity
@Table(name="customer")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customer_seq")
	@SequenceGenerator(sequenceName = "customer_seq", name="customer_seq", initialValue=1, allocationSize=1)
	@Column(name="customer_id")
	private int customerId;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="customer_address")
	private String customerAddress;
	@Column(name="customer_dob")
	private String customerDob;
	@Column(name="customer_email_id")
	private String customerEmailId;
	@Column(name="customer_phone_no")
	private int customerPhoneNo;
	@Column(name="customer_annual_income")
	private double customerAnnualIncome;
	@Column(name="customer_savings_account")
	private String customerSavingsAccount;
	@Column(name="customer_ifsc_code")
	private String customerIfscCode;
	@Column(name="customer_bank_name")
	private String customerBankName;
	@Column(name="customer_approved_status")
	private char customerApprovedStatus = 'N';
	@Autowired
	@OneToOne
	@JoinColumn(name="customer_card_number")
	private Card customerCard;
	
	
	public Customer() {
	
	}
	
	public Customer(int customerId, String customerName, String customerAddress, String customerDob,
			String customerEmailId, int customerPhoneNo, double customerAnnualIncome, String customerSavingsAccount,
			String customerIfscCode, String customerBankName, char customerApprovedStatus) {
	
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerDob = customerDob;
		this.customerEmailId = customerEmailId;
		this.customerPhoneNo = customerPhoneNo;
		this.customerAnnualIncome = customerAnnualIncome;
		this.customerSavingsAccount = customerSavingsAccount;
		this.customerIfscCode = customerIfscCode;
		this.customerBankName = customerBankName;
		this.customerApprovedStatus = customerApprovedStatus;
	}


	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerDob() {
		return customerDob;
	}
	public void setCustomerDob(String customerDob) {
		this.customerDob = customerDob;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public int getCustomerPhoneNo() {
		return customerPhoneNo;
	}
	public void setCustomerPhoneNo(int customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}
	public double getCustomerAnnualIncome() {
		return customerAnnualIncome;
	}
	public void setCustomerAnnualIncome(double customerAnnualIncome) {
		this.customerAnnualIncome = customerAnnualIncome;
	}
	public String getCustomerSavingsAccount() {
		return customerSavingsAccount;
	}
	public void setCustomerSavingsAccount(String customerSavingsAccount) {
		this.customerSavingsAccount = customerSavingsAccount;
	}
	public String getCustomerIfscCode() {
		return customerIfscCode;
	}
	public void setCustomerIfscCode(String customerIfscCode) {
		this.customerIfscCode = customerIfscCode;
	}
	public String getCustomerBankName() {
		return customerBankName;
	}
	public void setCustomerBankName(String customerBankName) {
		this.customerBankName = customerBankName;
	}
	public char getCustomerApprovedStatus() {
		return customerApprovedStatus;
	}
	public void setCustomerApprovedStatus(char customerApprovedStatus) {
		this.customerApprovedStatus = customerApprovedStatus;
	}
	public Card getCustomerCard() {
		return customerCard;
	}
	public void setCustomerCard(Card customerCard) {
		this.customerCard = customerCard;
	}
	

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", customerDob=" + customerDob + ", customerEmailId=" + customerEmailId
				+ ", customerPhoneNo=" + customerPhoneNo + ", customerAnnualIncome=" + customerAnnualIncome
				+ ", customerSavingsAccount=" + customerSavingsAccount + ", customerIfscCode=" + customerIfscCode
				+ ", customerBankName=" + customerBankName + ", customerApprovedStatus=" + customerApprovedStatus + "]";
	}

	
}
