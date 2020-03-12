package com.scanner.example;

import java.util.Scanner;

public class c2nextline {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = s.nextLine();
		System.out.println("My name is "+name);

	}

}
