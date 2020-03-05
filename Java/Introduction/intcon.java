import java.io.*;

public class intcon
{
	public static void main(String args[])throws IOException
	{
		Console cio = System.console();
		System.out.println("Enter 2 numbers : ");
		int a,b,c;
		a = Integer.parseInt(cio.readLine());
		b = Integer.parseInt(cio.readLine());
		c = a + b;
		System.out.println(c);
	}
}