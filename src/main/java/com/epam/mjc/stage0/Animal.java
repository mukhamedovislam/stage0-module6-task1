package com.epam.mjc.stage0;

public class Animal {

	private String color =  "white";
	private int numberOfPaws = 2;
	private boolean hasFur = true;
	
	public Animal(String color, int numberOfPaws, boolean hasFur){
		this.color = color;
		this.numberOfPaws = numberOfPaws;
		this.hasFur = hasFur;
	}
/*
	public String getDescription(String color, int numberOfPaws, boolean hasFur){
		return String.format("This animal is mostly %s. It has %d %s and %s fur.", color, numberOfPaws, numberOfPaws == 1 ? "paw" : "paws", hasFur ? "a" : "no");
	}
*/
	public String getDescription(){
        return "This animal is mostly " + color + ". It has " + numberOfPaws + (numberOfPaws>1?" paws":" paw") + " and " + (hasFur?"a":"no") + " fur.";
    }
}
