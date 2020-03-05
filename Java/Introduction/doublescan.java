import java.util.Scanner;
import java.io.*;

class doublescan
{
	public static void main(String args[])throws IOException 
	{
		Scanner s = new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter two numbers");
		a = s.nextDouble();
		b = s.nextDouble();
		c = a + b;
		System.out.println(c);
	}
}