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

	public void getDescription(String color, int numberOfPaws, boolean hasFur){
		System.out.println("This animal is mostly " + color + "." + "It has "
				+ numberOfPaws + " paws and " + hasFur == true ? "a fur." : "no fur.");
	}


}
