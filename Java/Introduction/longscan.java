import java.util.Scanner;
import java.io.*;

class longscan
{
	public static void main(String args[])throws IOException 
	{
		Scanner s = new Scanner(System.in);
		long a,b,c;
		System.out.println("Enter two numbers");
		a = s.nextLong();
		b = s.nextLong();
		c = a + b;
		System.out.println(c);
	}
}