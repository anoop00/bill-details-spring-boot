package com.retailstore.bill.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "bill_details")
public class BillDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private double grossAmount;
	private Date billDate;

	@OneToMany(mappedBy = "billDetails", cascade = CascadeType.ALL)
	private Set<ItemOrder> itemOrderSet = new HashSet<>();

	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(double grossAmount) {
		this.grossAmount = grossAmount;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public Set<ItemOrder> getItemOrderSet() {
		return itemOrderSet;
	}

	public void setItemOrderSet(Set<ItemOrder> itemOrderSet) {
		this.itemOrderSet = itemOrderSet;
	}

	
}
