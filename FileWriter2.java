package com.classofmay;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileWriter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
			FileWriter fr1 = new FileWriter("C:\\Users\\thomas\\Desktop\\myfile3.txt");
			
			fr1.write("//FileInputStream input =null;\r\n" + 
					"		FileOutputStream output  = null;\r\n" + 
					"		\r\n" + 
					"		try {\r\n" + 
					"			FileInputStream input = new FileInputStream(\"C:\\\\Users\\\\thomas\\\\Desktop\\\\input.txt\");\r\n" + 
					"			\r\n" + 
					"			 output = new FileOutputStream(\"C:\\\\Users\\\\thomas\\\\Desktop\\\\output.txt\");\r\n" + 
					"			\r\n" + 
					"			int i=0;\r\n" + 
					"			while((i=input.read()) != -1) {\r\n" + 
					"//				System.out.print((char)i);\r\n" + 
					"				output.write(i);\r\n" + 
					"			}\r\n" + 
					"			input.close();\r\n" + 
					"		}\r\n" + 
					"		catch(Exception e) {\r\n" + 
					"			System.out.println(\"Error while read/write a file: \" + e.getMessage());\r\n" + 
					"		}\r\n" + 
					"		\r\n" + 
					"	}");
			fr1.write("\r\n");
			
			fr1.close();
			
		}
		catch(Exception e) {
			
		e.printStackTrace();
	}

}
}