package com.retailstore.bill.util;

import java.util.Date;

import com.retailstore.bill.constant.Constant;
import com.retailstore.bill.model.BillDetails;

public class BillDetailsUtil {

	public static double getDiscountBillAmount(BillDetails billDetails) {

		double discountOnAmount = billDetails.getItemOrderSet().stream()
				.filter(io -> io.getItem().getItemCategoryCode() != "ITEM_CATEGORY.GROCERIES")
				.mapToDouble(io -> io.getItemQuantity() * io.getItem().getItemPrice()).reduce(0, Double::sum);
		
		if (billDetails.getUser().getUserType().equals(Constant.EMPLOYEE_TYPE)) {
			double discountAmount = 0.30 * discountOnAmount;
			return billDetails.getGrossAmount() - discountAmount;
		} else if (billDetails.getUser().getUserType().equals(Constant.AFFILIATE_TYPE)) {
			double discountAmount = 0.10 * discountOnAmount;
			return billDetails.getGrossAmount() - discountAmount;
		} else if (diffInYear(billDetails.getUser().getCreatedDate())) {
			double discountAmount = 0.05 * discountOnAmount;
			return billDetails.getGrossAmount() - discountAmount;
		} else {
			return billDetails.getGrossAmount() - (billDetails.getGrossAmount() / 100 * 5);
		}
	}

	private static boolean diffInYear(Date date) {

		long dif = new Date().getTime() - date.getTime();

		long differenceInYears = (dif / (1000l * 60 * 60 * 24 * 365));
		if (differenceInYears >= 2)
			return true;
		else
			return false;
	}

}
