package com.retailstore.bill.service;

import java.util.List;

import com.retailstore.bill.model.BillDetails;

public interface BillDiscountService {

	double getDiscountBill(long id);
	
	List<BillDetails> getAllBill();
}
