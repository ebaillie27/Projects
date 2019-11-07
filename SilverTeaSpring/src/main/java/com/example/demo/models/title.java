package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "title")
public class title {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int title_id;
	
	@Column
	private String title;

	public title() {
		super();
	}

	public title(int title_id, String title) {
		super();
		this.title_id = title_id;
		this.title = title;
	}

	public int getTitle_id() {
		return title_id;
	}

	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
