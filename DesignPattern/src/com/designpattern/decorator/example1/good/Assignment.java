package com.designpattern.decorator.example1.good;

public class Assignment extends Decorator {
	Member m;
	
	public Assignment(Member m) {
		this.m = m;
	}

	public Double cost() {
		return 500.00 + m.cost();
	}

}
