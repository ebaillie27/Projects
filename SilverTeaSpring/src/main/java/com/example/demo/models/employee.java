package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_id;
	
	@Column
	private String username;
	
	@Column
	private byte[] emp_password;
	
	@Column
	private int user_id;
	
	@Column
	private int title_id;
	
	@Column
	private int location_id;

	public employee() {
		super();
	}

	public employee(int employee_id, String username, byte[] emp_password, int user_id, int title_id, int location_id) {
		super();
		this.employee_id = employee_id;
		this.username = username;
		this.emp_password = emp_password;
		this.user_id = user_id;
		this.title_id = title_id;
		this.location_id = location_id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public byte[] getEmp_password() {
		return emp_password;
	}

	public void setEmp_password(byte[] emp_password) {
		this.emp_password = emp_password;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getTitle_id() {
		return title_id;
	}

	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
	
	
}
