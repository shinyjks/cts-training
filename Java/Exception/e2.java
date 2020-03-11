import java.io.*;

public class e2
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

			if(b == 0)throw new ArithmeticException();
			c = a / b;
			System.out.println("C value is ::: "+c);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Zero Divide Error");
		}
		finally
		{
			dis.close();
		}
	}
}