package com.stringbuffer.example;

public class s9 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Shiny");
		System.out.println("String = "+str);
		
		str.append("JKS");
		
		System.out.println("After append = "+str);
		
		str = new StringBuilder("XYZ");
		
		str.append("****%%%%");
		
		System.out.println("After append = "+str);

	}

}
