package com.collection.HashTable;

import java.util.Hashtable;

public class MyHashTableOperations {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("first", "First Inserted");
		ht.put("second", "Second Inserted");
		ht.put("third", "Third Inserted");
		System.out.println(ht);
		
		System.out.println("Value of key 'second':" + ht.get("second"));
		System.out.println("Is Hashtable empty? " + ht.isEmpty());
		ht.remove("third");
		System.out.println(ht);
		System.out.println("Size of the Hashtable: "+ht.size());
	}

}
