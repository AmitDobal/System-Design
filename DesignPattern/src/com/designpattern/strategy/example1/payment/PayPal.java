package com.designpattern.strategy.example1.payment;

public class PayPal implements Payment {

	private String emailId;
	private String password;

	public PayPal(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}
}
