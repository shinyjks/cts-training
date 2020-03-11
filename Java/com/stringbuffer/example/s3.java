package com.stringbuffer.example;

public class s3 {

	public static void main(String[] args) {
		//boolean b = true;
		StringBuffer sb1 = new StringBuffer("HelloWorld");
		sb1.insert(6, "ab");
		System.out.println(sb1);
		
		char c = 'Y';
		StringBuffer sb2 = new StringBuffer("Hello World");
		sb2.insert(6, c);
		System.out.println(sb2);
		
		char[] c1 = new char[]{'Y','e','s'};
		StringBuffer sb3 = new StringBuffer("Hello World");
		sb3.insert(6, c1);
		System.out.println(sb3);
		
		double d = 0.1;
		StringBuffer sb4 = new StringBuffer("Hello World");
		sb4.insert(6, d);
		System.out.println(sb4);
		
		float f = 2.0f;
		StringBuffer sb5 = new StringBuffer("Hello World");
		sb5.insert(6, f);
		System.out.println(sb5);
		
		int i = 5;
		StringBuffer sb6 = new StringBuffer("Hello World");
		sb6.insert(6, i);
		System.out.println(sb6);
		
		//long l = 10;
		StringBuffer sb7 = new StringBuffer("Hello World");
		sb7.insert(6, "10");
		System.out.println(sb7);
		
		Object obj = new String("My");
		StringBuffer sb8 = new StringBuffer("Hello World");
		sb8.insert(6, obj);
		System.out.println(sb8);
		
		String str = "New";
		StringBuffer sb9 = new StringBuffer("Hello World");
		sb9.insert(6, str);
		System.out.println(sb9);
	}

}
