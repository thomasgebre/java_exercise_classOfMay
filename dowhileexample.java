package com.classofmay;

public class dowhileexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i = 0;// while loop
//		while (i<10) {
//			
//			System.out.println(i);
//			
//			i++;
//		}
//			
//			System.out.println();
//			
//		for (int j=0; j<10;j++) {
//			
//			System.out.println(j);
//		
//		
//				}
//
//		System.out.println();
//		
//		
//		 int k = 0;// Do whole loop
//		 do {
//			 System.out.println(k);
//			 k++;
//		 } while (k<10);

//		int x = 21;//modulus operator
//
//		int result = x % 3 ; //The result is 1
//		int result2 = x % 2;
//
//		System.out.println(result);
//		System.out.println(result2);

//		int a = 4;//relational operators
//
//		int b = 1;
//
//		boolean c = a < b; // The result will be false
//		
//		System.out.println(c);

//		int number1 =25;// relational operators
//
//		int number2 = 45;
//
//		if(number1 > number2){
//
//		System.out.println("number 1 is greater than number2");
//
//		}
//
//		else {
//
//		System.out.println("number2 is greater than number1");

//		int num1 = 10;//logical operators
//
//		int num2 = 30;
//
//		int num3 = 45;
//
//		if((num1 < num2 ) || (num1 < num3)) {
//
//		System.out.println("The smallest of three numbers is: "+ num1);

		// number = (expression) ? 10 : -10; Ternary operator
//
//		double number = -5.5;
//
//		String result;
//
//		result = (number > 0.0) ? "positive" : "not positive";
//
//		System.out.println(number + " is " + result);

		// if else statements

//		int testscore = 76;
//
//		char grade;
//
//		if (testscore >= 90) {
//
//		grade = 'A';
//
//		} else if (testscore >= 80) {
//
//		grade = 'B';
//
//		} else if (testscore >= 70) {
//
//		grade = 'C';
//
//		} else if (testscore >= 60) {
//
//		grade = 'D';
//
//		} else {
//
//		grade = 'F';
//
//		}
//
//		System.out.println("Grade = " + grade);

		int testScore = 80;
		char grade;

		if (testScore >= 90) {
			grade = 'A';
		} else if (testScore >= 80) {
			grade = 'B';

		} else if (testScore >= 70) {
			grade = 'C';
		} else if (testScore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade = " + grade);
	}
}
