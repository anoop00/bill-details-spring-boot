package com.retailstore.bill;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.retailstore.bill.constant.Constant;
import com.retailstore.bill.model.BillDetails;
import com.retailstore.bill.model.Item;
import com.retailstore.bill.model.ItemOrder;
import com.retailstore.bill.model.User;
import com.retailstore.bill.repository.BillDetailsRepository;
import com.retailstore.bill.service.BillDiscountService;

@RunWith(SpringRunner.class)
@SpringBootTest
class BillApplicationTests {

	@Autowired
	private BillDiscountService billDiscountService;

	@MockBean
	private BillDetailsRepository billDetailsRepository;

	@Test
	public void getBillDetailsTest() {
		when(billDetailsRepository.findAll()).thenReturn(Stream.of(new BillDetails()).collect(Collectors.toList()));
		assertEquals(1, billDiscountService.getAllBill().size());
	}

	@Test
	public void getDiscountAmountTest() {

		User user = new User();
		user.setId(1);
		user.setUserType(Constant.EMPLOYEE_TYPE);

		Item item = new Item();
		item.setId(1);
		item.setItemCategoryCode(null);
		item.setItemName("Test");
		item.setItemOrder(null);
		item.setItemPrice(500.0);

		ItemOrder io = new ItemOrder();
		io.setId(1);
		io.setItem(item);
		io.setItemQuantity(2);

		BillDetails billDetails = new BillDetails();
		billDetails.setId(1);
		billDetails.setGrossAmount(1000.0);
		billDetails.setUser(user);

		Set<ItemOrder> itemOrders = new HashSet<>();
		itemOrders.add(io);
		billDetails.setItemOrderSet(itemOrders);

		when(billDetailsRepository.getById((long) 1)).thenReturn(billDetails);

		assertEquals(700.0, billDiscountService.getDiscountBill(1l),0.0);

	}

	@Test
	void contextLoads() {
	}

}
