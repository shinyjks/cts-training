package com.array.example;

import java.util.Arrays;

public class a6 {

	public static void main(String[] args) {
		double[] s1 = new double[]{213873.56788,87210.4567,320918.6789};
		double[] s2 = new double[]{213873.56788,87210.4567,320918.6789};
		
		boolean bt = Arrays.equals(s1, s2);
		System.out.println("Are two double arrays equal? : "+bt);

	}

}
