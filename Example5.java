package com.classofmay;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your full nmae: ");
		String name = input.nextLine();

		System.out.println("Enter your salary: ");
		int salary = input.nextInt();

		System.out.println("Enter your bonus: ");
		double bonus = input.nextDouble();

		double total_Salary = salary + bonus;

		System.out.println("The name of the employee is: " + name);
		System.out.println("the salary of the employee is: " + salary);
		System.out.println("the bonus of the employee is: " + bonus);
		System.out.println("the total salary of the employee is: " + total_Salary);

	}

}
