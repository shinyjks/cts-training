import java.io.*;
interface A
{
	public void display();
}
class sample implements A 
{
	public void display()
	{
		System.out.println("A implements in sample");
	}
}
class sample1 implements A 
{
	public void display()
	{
		System.out.println("A implements in sample1");
	}
}
class ref
{
	public static void main(String args[])
	{
		A x;	//x is a reference variable
		sample s = new sample();
		x = s;
		x.display();

		sample1 s1 = new sample1();
		x = s1;
		x.display();
	}
}