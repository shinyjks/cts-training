package com.stringbuffer.example;

public class s5 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hello World");
		sb1.delete(0, 6);
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("appolo");
		System.out.println(sb2);
		
		//sb2.delete(0,sb2,length());
		
		sb2.delete(0, 2);
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer("Hello World");
		sb3.deleteCharAt(6);
		System.out.println(sb3);

	}

}
