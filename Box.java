package com.classofmay;

class cupboard {
	double width;
	double height;
	double depth;
}

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double volume;
		
		cupboard satin = new cupboard();
		
		satin.width = 10;
		satin.height = 20;
		satin.depth = 30;
		
		volume = satin.width * satin.height * satin.depth;
		System.out.println("Volume of box is: " + volume);
	}
}
