package com.codingdojo.pets.models;

public class Cat extends Animal {

	public Cat() {
		this("No Name", "Breedless", 0.0);
	}
	
	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
	}
	
	public String showAffection() {
		String output = "Your " + this.breed + " cat, " + this.name + ",";
		output += " looked at you with some affection. You think.";
		return output;
	}
}
