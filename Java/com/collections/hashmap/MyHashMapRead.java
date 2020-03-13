package com.collections.hashmap;

import java.util.HashMap;
import java.util.Set;

public class MyHashMapRead {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("first", "First Inserted");
		hm.put("second", "Second Inserted");
		hm.put("third", "Third Inserted");
		System.out.println(hm);
		
		Set<String> keys = hm.keySet();
		for(String key: keys)
		{
			System.out.println("Value of "+ key +" is : "+hm.get(key));
		}
	}

}
