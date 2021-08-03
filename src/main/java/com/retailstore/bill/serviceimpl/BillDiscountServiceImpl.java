package com.retailstore.bill.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retailstore.bill.model.BillDetails;
import com.retailstore.bill.repository.BillDetailsRepository;
import com.retailstore.bill.service.BillDiscountService;
import com.retailstore.bill.util.BillDetailsUtil;

@Service
public class BillDiscountServiceImpl implements BillDiscountService {

	@Autowired
	private BillDetailsRepository billDetailsRepo;

	@Override
	public double getDiscountBill(long id) {

		BillDetails billDetails = billDetailsRepo.getById(id);
		System.out.println(billDetails);
		double finalBillAmount = BillDetailsUtil.getDiscountBillAmount(billDetails);
		return finalBillAmount;
	}

	@Override
	public List<BillDetails> getAllBill() {
		return billDetailsRepo.findAll();
	}

}
