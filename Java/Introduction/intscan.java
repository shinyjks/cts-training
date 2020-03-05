import java.util.Scanner;
import java.io.*;

class intscan
{
	public static void main(String args[])throws IOException 
	{
		Scanner s = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter two numbers");
		a = s.nextInt();
		b = s.nextInt();
		c = a + b;
		System.out.println(c);
	}
}