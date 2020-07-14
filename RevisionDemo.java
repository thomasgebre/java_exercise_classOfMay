package com.classofmay;

import java.util.Scanner;

class DemoScan{
	String name;
	int age;
	double salary;
	double bonus;
	
}
public class RevisionDemo {

	
	public static double salary;
	public static String dept = "Finance";
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EXERCISE 1
		//This program adds two given numbers and prints the result

		// on the console

//		int number1 = 25;
//
//		int number2 = 50;
//
//		int result = number1 + number2;
//
//		//result = number1 + number2;
//
//		// print the result
//
//		System.out.println("Number 1:"+number1);
//
//		System.out.println("Number 2:"+number2);
//
//		System.out.println("Result of addition :"+result);
		
		
		//EXCERCISE 2 scanner object
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("please enter the name of the the employe: ");
//		String name = input.nextLine();
//		
//		System.out.println("please enter the age of the the employe: ");
//		int age = input.nextInt();
//		
//		System.out.println("please enter the salary of the the employe: ");
//		double salary = input.nextDouble();
//		
//		System.out.println("please enter the bonu amount of the the employe: ");
//		double bonus = input.nextDouble();
//		
//		System.out.println("The name of the employee is: " + name);
//		System.out.println("Theage of the employee is: " + age);
//		System.out.println("The salary of the employee is: " + salary);
//		System.out.println("The bonus of the employee is: " + bonus);
//		
//		double totalSalary = salary + bonus;
//		System.out.println("The total salary of the employee is: " + totalSalary);
		
		
		//Example 3 static variable
		double salary = 5000;
		
		System.out.println("the salary of the employee is: " + salary);// these two are pulled from line 15&16
		System.out.println("the departmenet is: " + dept);
		
		System.out.println();
		
		
		System.out.println("the salary of the employee is: " + (salary=3000));
		System.out.println("the departmenet of employee is: " + dept);
		
		System.out.println();
		
		System.out.println("the salary of the employee is: " + salary);
		System.out.println("the departmenet of employee is: " + dept);
	}

}
