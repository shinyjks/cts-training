package com.stringbuffer.example;

public class SBuilderreverse {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Chennai");
		System.out.println("String = "+str);
		
		System.out.println("Reverse = "+str.reverse());
		
		str = new StringBuilder("EYE");
		System.out.println("String = "+str);
		
		System.out.println("Reverse = "+str.reverse());

	}

}
