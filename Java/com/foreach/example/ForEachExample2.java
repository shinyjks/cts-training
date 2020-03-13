package com.foreach.example;

import java.util.ArrayList;

public class ForEachExample2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Roja");
		list.add("Shiny");
		list.add("Jasmine");
		
		for(String s: list)
		{
			System.out.println(s);
		}

	}

}
