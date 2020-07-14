package com.classofmay;

class Marks {
	// these variables are instance Variables.

	int mathMarks;
	int phyMarks;
	int bioMarks;
}

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// first object
		Marks obj1 = new Marks();
		obj1.mathMarks = 78;
		obj1.phyMarks = 90;
		obj1.bioMarks = 94;

		// second object
		Marks obj2 = new Marks();
		obj2.mathMarks = 85;
		obj2.phyMarks = 45;
		obj2.bioMarks = 95;

		// displaying marks for the first Object
		System.out.println("Marks of first Object");
		System.out.println("maths mark for the first object: " + obj1.mathMarks);
		System.out.println(obj1.phyMarks);
		System.out.println(obj1.bioMarks);

		// displaying marks for the second object
		System.out.println("Marks of second object");
		System.out.println(obj2.mathMarks);
		System.out.println(obj2.phyMarks);
		System.out.println(obj2.bioMarks);

	}

}
