package com.classofmay;

class latiko {

	double width;

	double height;

	double depth;

	latiko() {

		width = 5;

		height = 10;

		depth = 3;

	}

	latiko(double w, double h, double d) {

		width = w;

		height = h;

		depth = d;

	}

	double volume() {

		return width * height * depth;

	}

}

public class Demopolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double volume;

		latiko myBox1 = new latiko();

		myBox1.width = 15;
		myBox1.height = 12;
		myBox1.depth = 17;
		
		volume = myBox1.width * myBox1.height * myBox1.depth;
		System.out.println("volume of the box is: " + volume);
		
		System.out.println("---------------------");
		
		
	
		
		latiko myBox2 = new latiko();
		
		volume = myBox2.width * myBox2.height * myBox2.depth;

		System.out.println("volume of the box is: " + volume);

	}

}
