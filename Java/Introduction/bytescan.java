import java.util.Scanner;
import java.io.*;

class bytescan
{
	public static void main(String args[])throws IOException 
	{
		Scanner s = new Scanner(System.in);
		byte a,b,c;
		System.out.println("Enter two numbers");
		a = s.nextByte();
		b = s.nextByte();
		c = (byte)(a + b);
		System.out.println(c);
	}
}