package com.stringbuffer.example;

public class SBuilderinsert {

	public static void main(String[] args) {
		StringBuilder str =new StringBuilder("Shiny JKS");
		System.out.println("String = "+str);
		
		str.insert(6, 'G');
		System.out.println("After Insertion = "+str);
		//System.out.println(str.toString());

	}

}
