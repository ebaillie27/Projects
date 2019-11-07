package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase")
public class purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchase_id;
	
	@Column
	private int customer_id;
	
	@Column
	private int location_id;
	
	@Column
	private int purchase_quantity;
	
	@Column
	private double total_purchase;

	public purchase() {
		super();
	}

	public purchase(int purchase_id, int customer_id, int location_id, int purchase_quantity, double total_purchase) {
		super();
		this.purchase_id = purchase_id;
		this.customer_id = customer_id;
		this.location_id = location_id;
		this.purchase_quantity = purchase_quantity;
		this.total_purchase = total_purchase;
	}

	public int getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(int purchase_id) {
		this.purchase_id = purchase_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public int getPurchase_quantity() {
		return purchase_quantity;
	}

	public void setPurchase_quantity(int purchase_quantity) {
		this.purchase_quantity = purchase_quantity;
	}

	public double getTotal_purchase() {
		return total_purchase;
	}

	public void setTotal_purchase(double total_purchase) {
		this.total_purchase = total_purchase;
	}

}
