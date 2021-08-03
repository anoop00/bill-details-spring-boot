package com.retailstore.bill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.retailstore.bill.model.BillDetails;
import com.retailstore.bill.service.BillDiscountService;

@RestController
public class RetailStoreController {

	@Autowired
	private BillDiscountService billDisCountService;

	@GetMapping("/getBill/{id}")
	public Double getFinalDetailBill(@PathVariable("id") long id) {

		double discountedAmount = billDisCountService.getDiscountBill(id);
		return discountedAmount;
	}

	@GetMapping("/getBill")
	public List<BillDetails> getAllBill() {

		return billDisCountService.getAllBill();
	}
}
