package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supply")
public class supply {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int supply_id;
	
	@Column
	private int item_id;
	
	@Column
	private int quantity;
	
	@Column
	private int location_id;

	public supply() {
		super();
	}

	public supply(int supply_id, int item_id, int quantity, int location_id) {
		super();
		this.supply_id = supply_id;
		this.item_id = item_id;
		this.quantity = quantity;
		this.location_id = location_id;
	}

	public int getSupply_id() {
		return supply_id;
	}

	public void setSupply_id(int supply_id) {
		this.supply_id = supply_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
	

}
