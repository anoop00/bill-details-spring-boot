package com.retailstore.bill.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_ref_data")
public class UserRefData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userRefDataText;
	private String userRefDataCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserRefDataText() {
		return userRefDataText;
	}
	public void setUserRefDataText(String userRefDataText) {
		this.userRefDataText = userRefDataText;
	}
	public String getUserRefDataCode() {
		return userRefDataCode;
	}
	public void setUserRefDataCode(String userRefDataCode) {
		this.userRefDataCode = userRefDataCode;
	}
	
	
}
