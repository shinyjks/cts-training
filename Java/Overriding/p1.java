class A
{
	void calculate(double x)
	{
		System.out.println("Square Value : "+(x*x));
	}
}
class B extends A
{
	void calculate(double x)
	{
		System.out.println("Square Root Value : "+Math.sqrt(x));
	} 
}
class p1
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.calculate(25);
	}
}