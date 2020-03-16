package com.array.example;

import java.util.Arrays;


public class a1 {

	public static void main(String[] args) {
		int x[] = new int[]{27,0,0};
		int y[] = new int[]{27,78,1023};
		
		boolean b = Arrays.equals(x, y);
		System.out.println("Are two int arrays equal?"+b);
		System.out.println("Are two int arrays equal?"+x[0]);

	}

}
