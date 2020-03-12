package com.stringbuffer.example;

public class SBuilderIndex {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Programming language");
		System.out.println("String = "+str);
		
		System.out.println("Index of substring = "+str.indexOf("age"));
		
		System.out.println("Index of substring = "+str.indexOf("k")); //returns -1 when the substring is not found

	}

}
