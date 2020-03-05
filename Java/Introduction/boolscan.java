import java.util.Scanner;
import java.io.*;

class boolscan
{
	public static void main(String args[])throws IOException 
	{
		Scanner s = new Scanner(System.in);
		boolean a;
		System.out.println("Enter true or false");
		a = s.nextBoolean();
		System.out.println("You have entered " + a);
	}
}