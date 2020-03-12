package com.stringbuffer.example;

public class s8 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("High cost");
		System.out.println("Original Text: "+sb);
		
		sb.replace(0, 5, "Low");
		System.out.println("Replaced Text: "+sb);

	}

}
