import java.io.*;

interface input
{
	void read();
}
interface measure extends input
{
	void area();
}
class triangle implements measure
{
	int b,h;
	triangle()
	{
		b = 0;
		h = 0;
	}
	public void read()
	{
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter the breadth");
			b = Integer.parseInt(dis.readLine());

			System.out.println("Enter the height");
			h = Integer.parseInt(dis.readLine());
		}
		catch(IOException e)
		{
			System.out.println("IO Error");
		}
	}
	public void area()
	{
		System.out.println("Area = "+0.5*b*h);
	}
}
class meas
{
	public static void main(String args[])
	{
		triangle t = new triangle();
		t.read();
		t.area();
	}
}