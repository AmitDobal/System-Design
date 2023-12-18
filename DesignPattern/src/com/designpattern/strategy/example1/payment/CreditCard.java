package com.designpattern.strategy.example1.payment;

public class CreditCard implements Payment {

	private String cardNo;
	private String cvv;
	private String dateOfExpiry;

	public CreditCard(String cardNo, String cvv, String dateOfExpiry) {
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid with credit card.");
	}

}
