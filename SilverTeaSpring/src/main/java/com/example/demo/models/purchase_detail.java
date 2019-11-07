package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_detail")
public class purchase_detail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchase_detail_id;
	
	@Column
	private int purchase_id;
	
	@Column
	private int item_id;

	public purchase_detail() {
		super();
	}

	public purchase_detail(int purchase_detail_id, int purchase_id, int item_id) {
		super();
		this.purchase_detail_id = purchase_detail_id;
		this.purchase_id = purchase_id;
		this.item_id = item_id;
	}

	public int getPurchase_detail_id() {
		return purchase_detail_id;
	}

	public void setPurchase_detail_id(int purchase_detail_id) {
		this.purchase_detail_id = purchase_detail_id;
	}

	public int getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(int purchase_id) {
		this.purchase_id = purchase_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	
	
	
}
