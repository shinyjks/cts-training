import java.io.*;

public class doublecon
{
	public static void main(String args[])throws IOException
	{
		Console cio = System.console();
		System.out.println("Enter 2 numbers : ");
		double a,b,c;
		a = Double.parseDouble(cio.readLine());
		b = Double.parseDouble(cio.readLine());
		c = a + b;
		System.out.println(c);
	}
}