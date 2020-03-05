import java.io.*;

public class floatcon
{
	public static void main(String args[])throws IOException
	{
		Console cio = System.console();
		System.out.println("Enter 2 numbers : ");
		float a,b,c;
		a = Float.parseFloat(cio.readLine());
		b = Float.parseFloat(cio.readLine());
		c = a + b;
		System.out.println(c);
	}
}