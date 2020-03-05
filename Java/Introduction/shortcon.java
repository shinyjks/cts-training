import java.io.*;

public class shortcon
{
	public static void main(String args[])throws IOException
	{
		Console cio = System.console();
		System.out.println("Enter 2 numbers : ");
		short a,b,c;
		a = Short.parseShort(cio.readLine());
		b = Short.parseShort(cio.readLine());
		c = (short)(a + b);
		System.out.println(c);
	}
}