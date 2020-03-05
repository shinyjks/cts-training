import java.io.*;

public class bytecon
{
	public static void main(String args[])throws IOException
	{
		Console cio = System.console();
		System.out.println("Enter 2 numbers : ");
		byte a,b,c;
		a = Byte.parseByte(cio.readLine());
		b = Byte.parseByte(cio.readLine());
		c = (byte)(a + b);
		System.out.println(c);
	}
}