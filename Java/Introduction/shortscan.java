import java.util.Scanner;
import java.io.*;

class shortscan
{
	public static void main(String args[])throws IOException 
	{
		Scanner s = new Scanner(System.in);
		short a,b,c;
		System.out.println("Enter two numbers");
		a = s.nextShort();
		b = s.nextShort();
		c = (short)(a + b);
		System.out.println(c);
	}
}