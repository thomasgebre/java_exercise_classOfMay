package com.classofmay;

import java.util.*;



public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String>itr= new LinkedList<String>();
		
		itr.add("messi");
//		itr.add(3);
		itr.add("Ronney");
		itr.add("Neymar");
		
		Iterator A1 = itr.iterator();
		
		while(A1.hasNext()) {
			
			System.out.println(A1.next());
		}

	}

}
