package com.classofmay;

public class RevisionDemo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//CALCULATING AVERAGE
//		double[] studentMarks = { 67, 78, 80, 95, 55, 77 };
//
//		double average = 0;
//
//		double sum = 0;
//
//		for (double element : studentMarks) {
//			sum = (sum + element);
//
//		}
//
//		average = sum / studentMarks.length; //or
//		average = sum/6;
//
//		System.out.println(average);
		
		
		
		//PASSING AN ARRAY TO A METHOD
		
		
//		double[] studentMarks = {67,78,80,95,55,77};
//
//		double average=0;
//
//		double sum = 0;
//
//		calcTotal(studentMarks);
//
//		}
//
//		public static void calcTotal(double[] marks) {
//
//		double total=0;
//
//		for (int i = 0; i < marks.length; i++) {
//
//		total = total + marks[i];
//
//		}
//
//		System.out.println("Total marks:"+total);
		
		
		
		//Two dimension array in Java
		
		
		int marks [] [] = {

				{50,65,70},

				{55 ,68,75},

				{57,61,78},

				{59 ,60,71}

				};
		for(int i=0;i<4;i++){

			System.out.println("Student"+i + " ");

			for(int j=0;j<3;j++){

			System.out.println(marks[j] + " ");

			}

			System.out.println();
			
		}
		
		
	}
}


