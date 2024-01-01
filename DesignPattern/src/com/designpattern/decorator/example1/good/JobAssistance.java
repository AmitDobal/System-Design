package com.designpattern.decorator.example1.good;

public class JobAssistance extends Decorator {
	Member m;

	public JobAssistance(Member m) {
		this.m = m;
	}

	public Double cost() {
		return 1000.00 + m.cost();
	}
}
