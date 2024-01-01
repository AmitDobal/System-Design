package com.designpattern.decorator.example2pizza.good;

import com.designpattern.decorator.example2pizza.good.base.BasePizza;
import com.designpattern.decorator.example2pizza.good.base.Farmhouse;
import com.designpattern.decorator.example2pizza.good.pizza.Pizza;
import com.designpattern.decorator.example2pizza.good.topping.ExtraCheese;
import com.designpattern.decorator.example2pizza.good.topping.Mushroom;

public class PizzaClient {

	public static void main(String[] args) {
		
		//Base Pizza
		Pizza farmhouse = new Farmhouse();//200
		
		//Toppings
		Pizza farmhousWithMushroom = new Mushroom(farmhouse);//200 + 35 = 235
		
		Pizza farmhousWithMushroomAndCheese = new ExtraCheese(farmhousWithMushroom); // 200 + 35 + 30 = 265
		
		System.out.println(farmhousWithMushroomAndCheese.cost());
	
	}

}
