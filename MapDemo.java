package com.classofmay;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> m = new HashMap<>();
		  
		m.put("1", "soresa");
		m.put("2", "John");
		
		
		System.out.println(m.values());
		
		System.out.println(m.keySet());
		
		System.out.println(m.entrySet());
		
		
		Set<String> keys  = m.keySet();
		
		for(String fg : keys) {
			System.out.println(fg);
		}
		
	}
}