package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "store_location")
public class store_location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int location_id;
	
	@Column
	private String location_name;

	public store_location() {
		super();
	}

	public store_location(int location_id, String location_name) {
		super();
		this.location_id = location_id;
		this.location_name = location_name;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	
	

}
