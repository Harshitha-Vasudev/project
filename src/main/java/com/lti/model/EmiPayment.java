package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emi_payment")
@Scope(scopeName="prototype")
@Entity
@Table(name="emi_payment")
public class EmiPayment {
	
	@Id
	@Column(name="emi_payment_id")
	private int emiPaymentId;
	@Column(name="emi_payment_receieved")
	private double emiPaymentReceieved;
	@Column(name="emi_payment_receieve_date")
	private String emiPaymentReceieveDate;
	@Column(name="emi_payment_ontime")
	private char emiPaymentOntime;
	
	
	/*@ManyToOne(cascade= CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="emi_id")
	private Emi emi;*/
	
	
	public EmiPayment() {
		
	}
	public EmiPayment(int emiPaymentId, double emiPaymentReceived, String emiPaymentReceiveDate,
			char emiPaymentOntime) {
		super();
		this.emiPaymentId = emiPaymentId;
		this.emiPaymentReceieved = emiPaymentReceived;
		this.emiPaymentReceieveDate = emiPaymentReceiveDate;
		this.emiPaymentOntime = emiPaymentOntime;
	}


	public int getEmiPaymentId() {
		return emiPaymentId;
	}
	public void setEmiPaymentId(int emiPaymentId) {
		this.emiPaymentId = emiPaymentId;
	}
	public double getEmiPaymentReceived() {
		return emiPaymentReceieved;
	}
	public void setEmiPaymentReceived(double emiPaymentReceived) {
		this.emiPaymentReceieved = emiPaymentReceived;
	}
	public String getEmiPaymentReceiveDate() {
		return emiPaymentReceieveDate;
	}
	public void setEmiPaymentReceiveDate(String emiPaymentReceiveDate) {
		this.emiPaymentReceieveDate = emiPaymentReceiveDate;
	}
	public char getEmiPaymentOntime() {
		return emiPaymentOntime;
	}
	public void setEmiPaymentOntime(char emiPaymentOntime) {
		this.emiPaymentOntime = emiPaymentOntime;
	}
	/*public Emi getEmi() {
		return emi;
	}
	public void setEmi(Emi emi) {
		this.emi = emi;
	}*/


	@Override
	public String toString() {
		return "EmiPayment [emiPaymentId=" + emiPaymentId + ", emiPaymentReceived=" + emiPaymentReceieved
				+ ", emiPaymentReceiveDate=" + emiPaymentReceieveDate + ", emiPaymentOntime=" + emiPaymentOntime + "]";
	}
	
	
}
