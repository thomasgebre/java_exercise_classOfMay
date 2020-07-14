package com.classofmay;

public class Example8 {

	int age = 23; // instance variable
	
	static int salary=3000; // this is static variable

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

		Example8 mc = new Example8();

		mc.methodOne();
		mc.methodTwo();
		mc.methodThree();

		System.out.println(mc.age = 24);
		
		System.out.println(Example8.salary = 3500);// if change the value then it changes every time i call it coz data is shared unlike instance variable

		Example8 mc2 = new Example8();
		
		System.out.println(mc2.age); // mc2.age pulls the original value in instance variables
		
		System.out.println(Example8.salary);//this call the static variable salary from the class
	}

}
