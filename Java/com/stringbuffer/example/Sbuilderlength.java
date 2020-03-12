package com.stringbuffer.example;

public class Sbuilderlength {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Praise the Lord!");
		System.out.println("String Builder length = "+str.length());
		
		str = new StringBuilder("");
		System.out.println("String Builder length = "+str.length());

	}

}
