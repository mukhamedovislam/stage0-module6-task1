package com.epam.mjc.stage0;

public class Bird extends Animal {
	public Bird(){
		super(color) = "blue";
		super(numberOfPaws) = 2;
		super(hasFur) = false;
	}
	@override
	public String getDescription(String color, int numberOfPaws, boolean hasFur){
		return String.format("This animal is mostly %s. It has %d %s and %s fur. Moreover, it has 2 wings and can fly.", color, numberOfPaws, numberOfPaws == 1 ? "paw" : "paws", hasFur ? "a" : "no");
	}
}
