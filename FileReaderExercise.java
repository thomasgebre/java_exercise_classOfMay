package com.classofmay;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReaderExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		FileInputStream input =null;
//		FileOutputStream output  = null;
		
		try {
			FileInputStream input = new FileInputStream("C:\\Users\\thomas\\Desktop\\input.txt");
			
			FileOutputStream output = new FileOutputStream("C:\\Users\\thomas\\Desktop\\output.txt");
			
			int i=0;
			while((i=input.read()) != -1) {
			System.out.print((char)i);
				output.write(i);
			}
			input.close();
		}
		catch(Exception e) {
			System.out.println("Error while read/write a file: " + e.getMessage());
	}

}
}
