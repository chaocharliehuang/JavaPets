package com.codingdojo.pets.models;

public class Dog extends Animal implements Pet {
	
	public Dog() {
		this("No Name", "Breedless", 0.0);
	}
	
	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
	}
	
	public String showAffection() {
		String output = this.name;
		if (this.weight < 30) {
			output += " hopped into your lap ";
		} else {
			output += " curled up next to you ";
		}
		output += "and cuddled you!";
		return output;
	}
}
