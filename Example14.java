package com.classofmay;


class grades{
	int mathsgrades;
	int biogrades;
	int phygrades;
}
	public class Example14 {
		
		
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	grades semester1 = new grades();
	
	semester1.mathsgrades = 78;
	semester1.biogrades = 95;
	semester1.phygrades = 90;
	
	System.out.println("the grade for 1st semester is as follows: ");
	System.out.println("maths: " + semester1.mathsgrades);
	System.out.println("bio: " + semester1.biogrades);
	System.out.println("physics: " + semester1.phygrades);
	
	}

}