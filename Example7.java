package com.classofmay;

public class Example7 {

	int age = 23; // instance variable

	public void methodOne() {
		int i = 25; // local variable
		System.out.println("the value of i is: " + i);
		System.out.println("age: " + age);
	}

	public void methodTwo() {
		int j = 45; // local variable
		System.out.println("the value of j is: " + j);
		System.out.println("age : " + age);
	}

	public void methodThree() {
		int j = 65; // local variable
		System.out.println("the value of j is: " + j);
		System.out.println("age: " + age);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Example7 mc = new Example7();

		mc.methodOne();
		mc.methodTwo();
		mc.methodThree();

		System.out.println(mc.age = 24);

		Example7 mc2 = new Example7();
		System.out.println(mc2.age); // mc2.age pulls the original value in instance variables
	}
}
