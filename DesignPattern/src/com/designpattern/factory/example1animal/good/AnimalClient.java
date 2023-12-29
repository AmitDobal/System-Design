package com.designpattern.factory.example1animal.good;

import com.designpattern.factory.example1animal.good.animal.Animal;
import com.designpattern.factory.example1animal.good.animal.AnimalFactory;
import com.designpattern.factory.example1animal.good.constant.AnimalType;

public class AnimalClient {
	public static void main(String[] args) {
		Animal animal = AnimalFactory.getAnimal(AnimalType.DOG);
		animal.eat();
	}
}
