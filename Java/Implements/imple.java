import java.io.*;
interface Measure
{
	void read();
	void area();
}
class square implements Measure
{
	int a;
	square()
	{
		a = 0;
	}
	public void read()
	{
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter the SID");
			a = Integer.parseInt(dis.readLine());
		}
		catch(IOException e)
		{
			System.out.println("Input and Output Error");
		}
	}
	public void area()
	{
		System.out.println("Area = "+a*a);
	}
}
class rect implements Measure
{
	int l,b;
	rect()
	{
		l = 0;
		b = 0;
	}
	public void read()
	{
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter the Length");
			l = Integer.parseInt(dis.readLine());
			System.out.println("Enter the Breadth");
			b = Integer.parseInt(dis.readLine());
		}
		catch(IOException e)
		{
			System.out.println("Input and Output Error");
		}
	}
	public void area()
	{
		System.out.println("Area = "+l*b);
	}
}
class imple
{
	public static void main(String args[])
	{
		square s = new square();
		s.read();
		s.area();

		rect r = new rect();
		r.read();
		r.area();
	}
}