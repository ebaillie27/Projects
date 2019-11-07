package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	
	@Column
	private int user_id;
	
	@Column
	private String Username;
	
	@Column
	private byte[] cus_password;

	public customer() {
		super();
	}

	public customer(int customer_id, int user_id, String username, byte[] cus_password) {
		super();
		this.customer_id = customer_id;
		this.user_id = user_id;
		Username = username;
		this.cus_password = cus_password;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public byte[] getCus_password() {
		return cus_password;
	}

	public void setCus_password(byte[] cus_password) {
		this.cus_password = cus_password;
	}
	
	
}
