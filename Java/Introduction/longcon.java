import java.io.*;

public class longcon
{
	public static void main(String args[])throws IOException
	{
		Console cio = System.console();
		System.out.println("Enter 2 numbers : ");
		long a,b,c;
		a = Long.parseLong(cio.readLine());
		b = Long.parseLong(cio.readLine());
		c = a + b;
		System.out.println(c);
	}
}