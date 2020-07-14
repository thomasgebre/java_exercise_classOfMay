package com.classofmay;

import java.util.Scanner;

public class Arrayexample2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("plese enter size of the array");
		int size =  input.nextInt();
		
		String[]  nameOfStudent = new String[size];
		System.out.println("pls enter the elements of array:");
		
		for(int i=0; i< nameOfStudent.length; i++) {
			 nameOfStudent[i] = input.next();
		}
		
		System.out.println();
		
		for(int i=0; i<nameOfStudent.length; i++) {
			System.out.println(nameOfStudent[i]);
		}
		
		System.out.println();
		
		for( String i : nameOfStudent) {
			System.out.println(i);
		}
	}
	
	
	

}
