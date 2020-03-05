import java.util.Scanner;
import java.io.*;

class floatscan
{
	public static void main(String args[])throws IOException 
	{
		Scanner s = new Scanner(System.in);
		float a,b,c;
		System.out.println("Enter two numbers");
		a = s.nextFloat();
		b = s.nextFloat();
		c = a + b;
		System.out.println(c);
	}
}