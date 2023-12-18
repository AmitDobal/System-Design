package com.designpattern.strategy.example1;

import com.designpattern.strategy.example1.entity.Item;
import com.designpattern.strategy.example1.payment.CreditCard;
import com.designpattern.strategy.example1.payment.PayPal;

public class Client {
	public static void main(String[] args) {
		PaymentStrategy paymentStrategy = new PaymentStrategy();
		
		//Items in cart
		Item item1 = new Item("121", 20);
		Item item2 = new Item("111", 10);
		Item item3= new Item("123", 50);
		
		//Add to the strategy
		paymentStrategy.add(item1);
		paymentStrategy.add(item2);
		paymentStrategy.add(item3);
		
		//Pay with PayPal
		paymentStrategy.pay(new PayPal("abc@gmail.com", "pwd"));
		
		//Pay with Credit card
		paymentStrategy.pay(new CreditCard("31234354353"	, "123", "12/30"));
	}
}
