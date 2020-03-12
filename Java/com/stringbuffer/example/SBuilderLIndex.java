package com.stringbuffer.example;

public class SBuilderLIndex {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Java Program");
		System.out.println("String = "+str);
		
		System.out.println("Last Index of a = "+str.lastIndexOf("a"));
		
		System.out.print("Last Index of va = ");
		System.out.println(str.lastIndexOf("va"));
		
		System.out.print("Last index of av = ");
		System.out.println(str.lastIndexOf("av")); 

	}

}
