package com.designpattern.factory.example1animal.good.animal;

import com.designpattern.factory.example1animal.good.constant.AnimalType;

public class AnimalFactory {

	public static Animal getAnimal(AnimalType animalType) {

		if (animalType == AnimalType.CAT) {
			return new Cat();
		} else if (animalType == AnimalType.DOG) {
			return new Dog();
		} else if (animalType == AnimalType.MONKEY) {
			return new Monkey();
		}
		return null;
	}
}
