package com.array.example;

import java.util.Arrays;

public class a9 {

	public static void main(String[] args) {
		String s1[] = new String[]{"ram","kumar"};
		String s2[] = new String[]{"ram","ram"};
		
		boolean bt = Arrays.equals(s1, s2);
		System.out.println("Are two String arrays equal? : "+bt);

	}

}
