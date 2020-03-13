package com.collections.hashset;

import java.util.HashSet;

public class MyBasicHashSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		System.out.println(hs);
		
		System.out.println("Is Hashset empty? "+hs.isEmpty());
		hs.remove("third");
		System.out.println(hs);
		
		System.out.println("Size of the HashSet : "+hs.size());
		System.out.println("Does HashSet contains the first element ? "+hs.contains("first"));

	}

}
