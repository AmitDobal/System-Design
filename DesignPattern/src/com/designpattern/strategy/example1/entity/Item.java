package com.designpattern.strategy.example1.entity;

public class Item {
	private String code;
	private int price;

	public Item(String code, int price) {
		this.code = code;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
