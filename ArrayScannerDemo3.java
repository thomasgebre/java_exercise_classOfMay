package com.classofmay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayScannerDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> list = new ArrayList();
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("pls enter the size of your array: ");
		int size = input.nextInt();

		//System.out.println("pls enter the elements of array:");

		for (int i = 0; i < size; i++) {
			System.out.println("please enter elements of the array: ");
			list.add(input.next());
		}

		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			String x = (String) itr.next();
			if (x.equals("ashu")) {

				itr.remove();
			
			
	}

}
		System.out.println(list);
}



}

