package com.classofmay;

import java.util.*;




public class ArrayListDemo {
	public static void main(String[] args) {
		
		
		ArrayList<Comparable> list=new ArrayList<Comparable>();
		
		list.add("messi");
		list.add(3);
		list.add("Ronney");
		list.add("Neymar");
        
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}
