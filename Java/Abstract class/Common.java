class Myclass
{
	void calculate(double x)
	{
		System.out.println("Square value = "+(x*x));
	}
}
class Common
{
	public static void main(String args[])
	{
		Myclass m1 = new Myclass();
		Myclass m2 = new Myclass();
		Myclass m3 = new Myclass();

		//call calculate() method from the objects
		m1.calculate(3);
		m2.calculate(4);
		m3.calculate(5);
	}
}