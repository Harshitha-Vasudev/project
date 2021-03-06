package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("product")
@Scope(scopeName="prototype")
@Entity
@Table(name="product")
public class Product {
	
	@Id
	@Column(name="product_id")
	private int productId;
	@Column(name="product_code")
	private String productCode;
	@Column(name="product_name")
	private String productName;
	@Column(name="product_processing_fees")
	private int productProcessingFees;
	@Column(name="product_price")
	private double productPrice;
	@Column(name="product_units_in_stock")
	private int productUnitsInStock;
	@Column(name="product_description")
	private String productDescription;

	public Product() {
	
	}
	
	
	
	
	public Product(int productId, String productCode, String productName, int productProcessingFees,
			double productPrice, int productUnitsInStock, String productDescription) {
	
		this.productId = productId;
		this.productCode = productCode;
		this.productName = productName;
		this.productProcessingFees = productProcessingFees;
		this.productPrice = productPrice;
		this.productUnitsInStock = productUnitsInStock;
		this.productDescription = productDescription;
	}




	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductProcessingFees() {
		return productProcessingFees;
	}
	public void setProductProcessingFees(int productProcessingFees) {
		this.productProcessingFees = productProcessingFees;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductUnitsInStock() {
		return productUnitsInStock;
	}
	public void setProductUnitsInStock(int productUnitsInStock) {
		this.productUnitsInStock = productUnitsInStock;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCode=" + productCode + ", productName=" + productName
				+ ", productProcessingFees=" + productProcessingFees + ", productPrice=" + productPrice
				+ ", productUnitsInStock=" + productUnitsInStock + ", productDescription=" + productDescription + "]";
	}
	
	
	

}
