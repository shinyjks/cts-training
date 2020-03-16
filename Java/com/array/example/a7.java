package com.array.example;

import java.util.Arrays;

public class a7 {

	public static void main(String[] args) {
		long[] s1 = new long[]{213873,87210,320918};
		long[] s2 = new long[]{213873,87210,320918};
		
		boolean bt = Arrays.equals(s1, s2);
		System.out.println("Are two long arrays equal? : "+bt);

	}

}
