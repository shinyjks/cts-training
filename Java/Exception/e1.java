import java.io.*;

public class e1
{
	public static void main(String[] args)throws IOException
	{
		int a,b,c;
		DataInputStream dis = new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the number::");
			a = Integer.parseInt(dis.readLine());
			System.out.println("Enter the number::");
			b = Integer.parseInt(dis.readLine());
			c = a / b;
			System.out.println("C value is ::: "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}