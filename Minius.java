package com.classofmay;

import java.util.Scanner;

public class Minius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("enter your first grade");
		int gr1 = sc.nextInt();
		
		System.out.println("please eneter your second grade");
		int gr2 = sc.nextInt();
		
		System.out.println("please enter your third grade");
		int gr3 = sc.nextInt();
		
		double avg = (gr1 +gr2 + gr3)/3;
		
		
		if (avg >= 90) {
			System.out.println("your grade is A");
		}else if(avg>=80 ){
			System.out.println("your grade is B");
		}else if(avg>=70){
			System.out.println("your grade is C");
		}else if(avg>=60){
			System.out.println("your grade is D");
		}else if(avg>=0){
			System.out.println("your grade is F");
		}else {
			System.out.println("No grade");
		}
	}

	}
