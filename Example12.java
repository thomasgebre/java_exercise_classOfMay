package com.classofmay;

class SemisterOne {
	//instance variable construction examples
	int mathsMarks;
	int physMarks;
	int bioMarks;
	
}

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SemisterOne obj1 = new SemisterOne();
		obj1.mathsMarks = 75;
		obj1.physMarks = 80;
		obj1.bioMarks = 85;
		
		SemisterOne obj2 = new SemisterOne();
		obj2.mathsMarks = 65;
		obj2.physMarks = 68;
		obj2.bioMarks = 75;
		
		//displaying first obj
		
		System.out.println("the grade of thomas for first semister is:");
		System.out.println("maths: " + " " + obj1.mathsMarks);
		System.out.println("physics: " + " " + obj1.physMarks);
		System.out.println("biology: " + " " + obj1.bioMarks);
		
		//displaying second obj
		
		System.out.println("the grade of thomas for second semister is:");
		System.out.println("maths: " + "" + obj2.mathsMarks);
		System.out.println("physics: " + " " + obj2.physMarks);
		System.out.println("biology: " + " " + obj2.bioMarks);
		
	}

}
