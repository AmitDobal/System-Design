package com.designpattern.decorator.example2pizza.good.topping;

import com.designpattern.decorator.example2pizza.good.base.BasePizza;

public class ExtraCheese extends ToppingDecorator {

	BasePizza  basePizza;
	
	public ExtraCheese(BasePizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public int cost() {
		return basePizza.cost() + 30;
	}

}
