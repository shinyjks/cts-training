package com.collections.arraylist;

import java.util.ArrayList;

public class a1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add("1");
		a.add("2");
		a.add("3");
		
		/* To add an element at the specified index of ArrayList use
		 * void add(int index, Object obj) method*/
		
		a.add(1,"Inserted Element");
		a.add(2,"Shiny");
		
		/*add method DOES NOT overwrites the element previously at the specified index in the list.
		 * It shifts the elements to right side and increasing the list size by 1. */
		System.out.println("ArrayList contains...");
		
		for(int i = 0; i < a.size(); i++)
		{
			System.out.println(a.get(i));
		}

	}

}
