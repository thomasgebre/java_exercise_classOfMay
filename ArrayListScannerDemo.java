package com.classofmay;

import java.util.*;

public class ArrayListScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList();

//		list.add("messi");
//		list.add(3);
//		list.add("Ronney");
//		list.add("Neymar");
//        
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
			
			System.out.println(itr.next());
	}

}
}