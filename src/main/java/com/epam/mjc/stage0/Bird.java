package com.epam.mjc.stage0;

public class Bird extends Animal {
	public Bird(){
		super("blue", 2, false);
	}
/*
	@Override
	public String getDescription(String color, int numberOfPaws, boolean hasFur){
		return String.format("This animal is mostly %s. It has %d %s and %s fur. Moreover, it has 2 wings and can fly.", color, numberOfPaws, numberOfPaws == 1 ? "paw" : "paws", hasFur ? "a" : "no");
	}
*/
	@Override
    public String getDescription() {
        return "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
    }
}
