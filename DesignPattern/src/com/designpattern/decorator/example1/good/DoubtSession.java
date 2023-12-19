package com.designpattern.decorator.example1.good;

public class DoubtSession extends Decorator {
	Member m;

	public DoubtSession(Member m) {
		this.m = m;
	}

	public Double cost() {
		return 800.00 + m.cost();
	}
}
