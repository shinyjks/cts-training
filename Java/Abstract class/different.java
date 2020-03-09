import java.io.*;

abstract class Myclass
{
	abstract void calculate(double x);
}
class sub1 extends Myclass
{
	void calculate(double x)
	{
		System.out.println("Square value is ::: "+(x*x));
	}
}
class sub2 extends Myclass
{
	void calculate(double x)
	{
		System.out.println("Square root value is ::: "+ Math.sqrt(x));
	}
}
class sub3 extends Myclass
{
	void calculate(double x)
	{
		System.out.println("Cube value is ::: "+(x*x*x));
	}
}
class different
{
	public static void main(String args[])
	{
		sub1 s1 = new sub1();
		sub2 s2 = new sub2();
		sub3 s3 = new sub3();

		//let the objects call and use calculate method

		s1.calculate(3);		//calculates square value
		s2.calculate(4);		//calculates square root value
		s3.calculate(5);		//calculates cube value
	}
}