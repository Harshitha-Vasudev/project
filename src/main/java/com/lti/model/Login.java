package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("login")
@Scope(scopeName="prototype")
@Entity
@Table(name="login")
public class Login {
	
	@Id
	@Column(name="user_name")
	private String username;
	@Column(name="password")
	private String password;
	
	@Autowired
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="account_id")
	private Customer customer;
	
	public Login() {
	
	}
	public Login(String username, String password) {
	
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}
	
	
}
