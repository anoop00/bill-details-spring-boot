package com.retailstore.bill.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_ref_data")
public class ItemRefData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String itemRefeDataText;
	private String itemRefDataCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemRefeDataText() {
		return itemRefeDataText;
	}
	public void setItemRefeDataText(String itemRefeDataText) {
		this.itemRefeDataText = itemRefeDataText;
	}
	public String getItemRefDataCode() {
		return itemRefDataCode;
	}
	public void setItemRefDataCode(String itemRefDataCode) {
		this.itemRefDataCode = itemRefDataCode;
	}
	
	
}
