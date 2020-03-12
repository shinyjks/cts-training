package com.stringbuffer.example;

public class SBuilderdelete {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("SRM IST RMP");
		System.out.println("String = "+str);
		
		str.delete(4, 7);
		System.out.println("After deletion = "+str);

	}

}
