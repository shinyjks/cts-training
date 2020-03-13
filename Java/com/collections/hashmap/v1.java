package com.collections.hashmap;

import java.util.HashMap;

public class v1 {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("first","First Inserted");
		hm.put("third", "Third Inserted");
		System.out.println(hm);
		
		System.out.println("Value of second: "+hm.get("second"));
		System.out.println("Is HashMap empty?"+hm.isEmpty());
		hm.remove("third");
		
		System.out.println(hm);
		System.out.println("Size of the HashMap: "+hm.size());

	}

}
