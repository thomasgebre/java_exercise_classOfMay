package com.classofmay;

public class Arrayexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String[] nameOfStudent = new String[5];

//		nameOfStudent[0] = "Amir";
//		nameOfStudent[1] = "thomas";
//		nameOfStudent[2] = "solomon";
//		nameOfStudent[3] = "tarik";
//		nameOfStudent[4] = "bisrat";
//
//		System.out.println(nameOfStudent[0]);
//		System.out.println(nameOfStudent[1]);
//		System.out.println(nameOfStudent[2]);
//		System.out.println(nameOfStudent[3]);
//		System.out.println(nameOfStudent[4]);

		String[] nameOfStudent = { "Amir", "thomas", "solomon", "tarik", "bisrat" , ""};

		System.out.println(nameOfStudent.length);

//		System.out.println(nameOfStudent[0]);
//		System.out.println(nameOfStudent[1]);
//		System.out.println(nameOfStudent[2]);
//		System.out.println(nameOfStudent[3]);
//		System.out.println(nameOfStudent[4]);
		
	//	for(int i = 0; i <nameOfStudent.length; i++) {
		//	System.out.println(nameOfStudent[i]);
	//	}
		
		for(String i: nameOfStudent) {
			System.out.println(i);
		}
	}
}
