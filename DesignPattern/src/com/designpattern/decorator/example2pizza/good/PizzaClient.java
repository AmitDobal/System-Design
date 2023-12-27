package com.designpattern.decorator.example2pizza.good;

import com.designpattern.decorator.example2pizza.good.base.BasePizza;
import com.designpattern.decorator.example2pizza.good.base.Farmhouse;
import com.designpattern.decorator.example2pizza.good.topping.ExtraCheese;
import com.designpattern.decorator.example2pizza.good.topping.Mushroom;

public class PizzaClient {

	public static void main(String[] args) {
		
		BasePizza farmhouse = new Farmhouse();
		BasePizza mushroom = new Mushroom(farmhouse);
		
		BasePizza cheese = new ExtraCheese(mushroom);
		
		System.out.println(cheese.cost());
	
	}

}
