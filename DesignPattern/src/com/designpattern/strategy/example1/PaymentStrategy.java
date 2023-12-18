package com.designpattern.strategy.example1;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.strategy.example1.entity.Item;
import com.designpattern.strategy.example1.payment.Payment;

public class PaymentStrategy {

	List<Item> items = new ArrayList<>();

	public void add(Item item) {
		items.add(item);
	}

	public void pay(Payment payment) {
		int amount = items.stream().map(Item::getPrice).reduce(0, (a, b) -> a + b);
		payment.pay(amount);
	}
}
