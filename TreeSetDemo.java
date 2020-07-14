package com.classofmay;

import java.util.*;


public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> set=new TreeSet<String>();
		
		set.add("Rooney");
		set.add("Messi");
		set.add("Ronaldo");
		set.add("Martial");
		set.add("Rooney");
		
		//traversing elements
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());

	}

}
}
