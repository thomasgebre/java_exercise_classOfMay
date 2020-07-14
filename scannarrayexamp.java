package com.classofmay;

import java.util.Scanner;

public class scannarrayexamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

//		System.out.println("enter the size of the array: ");
//		int size = input.nextInt();
//
//		String[] nameofstudent = new String[size];
//		System.out.println("enter the elements of the array: ");
//
//		for (int i = 0; i < nameofstudent.length; i++) {
//			nameofstudent[i] = input.next();
//		}
//
//		System.out.println();
//		
//		for (int i = 0; i < nameofstudent.length; i++) {
//			System.out.println(nameofstudent[i]);

//		System.out.println("enter the size of the array: ");
//		int size = input.nextInt();
//		
//		String[] nameofstudent = new String[size];
//		System.out.println("enter the elements: ");
//		
//		for(int i=0; i<nameofstudent.length; i++) {
//			nameofstudent[i] = input.next();
//		}
//		
//		System.out.println();
//		
//		for(int i=0; i<nameofstudent.length; i++) {
//			System.out.println(nameofstudent[i]);
//		}
//		
//		System.out.println();
//
//		for(String element: nameofstudent) {
//			System.out.println(element);

		System.out.println("enter the size of the array: ");
		int size = input.nextInt();

		String[] nameofteachers = new String[size];
		System.out.println("enter the elements of the array: ");

		for (int i = 0; i < nameofteachers.length; i++) {
			nameofteachers[i] = input.next();

		}
		System.out.println();

		for (int i = 0; i < nameofteachers.length; i++) {
			System.out.println(nameofteachers[i]);
		}

		System.out.println();

		for (String element : nameofteachers) {
			System.out.println(element);
		}

	}

}