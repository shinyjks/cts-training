package com.array.example;

import java.util.Arrays;

public class a8 {

	public static void main(String[] args) {
		short[] s1 = new short[]{107,93,58};
		short[] s2 = new short[]{107,93,58};
		
		boolean bt = Arrays.equals(s1, s2);
		System.out.println("Are two short arrays equal? : "+bt);

	}

}
