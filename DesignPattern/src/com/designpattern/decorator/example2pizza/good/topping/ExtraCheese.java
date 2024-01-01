package com.designpattern.decorator.example2pizza.good.topping;

import com.designpattern.decorator.example2pizza.good.base.BasePizza;
import com.designpattern.decorator.example2pizza.good.pizza.Pizza;

public class ExtraCheese extends ToppingDecorator {

	Pizza  pizza;
	
	public ExtraCheese(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public int cost() {
		return pizza.cost() + 30;
	}

}
