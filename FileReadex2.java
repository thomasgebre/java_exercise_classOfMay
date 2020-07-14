package com.classofmay;

import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReadex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		try{
			FileInputStream str = new FileInputStream("C:\\Users\\thomas\\Desktop\\inputnew.txt");
			FileOutputStream str2 = new FileOutputStream("C:\\Users\\thomas\\Desktop\\outputnew.txt");
			
			int i=0;
			while((i=str.read()) != -1){
				System.out.print((char)i);
				str2.write(i);
					
			}
			str.close();
			
		}
		catch(Exception e) {
			System.out.println("wrong message: " + e.getMessage());
		}
	}

}
