package com.classofmay;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	        try {
	            FileWriter writer = new FileWriter("C:\\Users\\thomas\\Desktop\\myfile.txt", true);
	          
	            writer.write("Hello World");
	            writer.write("\r\n");   // write new line
	            writer.write("Good Bye!");
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 	
		
		
	}

}
