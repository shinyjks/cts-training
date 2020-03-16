package com.array.example;

import java.util.Arrays;

public class a3 {

	public static void main(String[] args) {
		char[] x = new char[]{'d','h','r','f'};
		char[] y = new char[]{'d','h','r','f'};
		
		boolean b = Arrays.equals(x, y);
		System.out.println("Are two char arrays equal? "+b);
	}

}
