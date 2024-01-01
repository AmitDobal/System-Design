package com.designpattern.decorator.example2pizza.good.topping;

import com.designpattern.decorator.example2pizza.good.pizza.Pizza;

public class Mushroom extends ToppingDecorator {

	Pizza pizza;
	
	public Mushroom(Pizza pizza) {
		this.pizza = pizza;
	}


	@Override
	public int cost() {
		return pizza.cost() + 35;
	}

}
