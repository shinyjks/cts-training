package com.tostring.example;

public class Student {
	int rollno;
	String name;
	String city;
	
	Student(int rollno, String name, String city)
	{
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}
	
	public String toString()
	{
		//overriding toString() method
		return rollno+" "+name+" "+city;
	}

	public static void main(String[] args) {
		Student s1 = new Student(101, "Rajkumar", "Chennai");
		Student s2 = new Student(102, "Vijayakumar", "Madurai");
		System.out.println(s1);
		System.out.println(s2);

	}

}
