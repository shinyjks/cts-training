package com.array.example;

import java.util.Arrays;

public class a5 {

	public static void main(String[] args) {
		
		boolean[] x = new boolean[]{true, false, true};
		boolean[] y = new boolean[]{true, false, true};
		
		boolean b = Arrays.equals(x, y);
		System.out.println("Are two boolean arrays equal? :"+b);

	}

}
