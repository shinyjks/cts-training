import java.io.*;
import java.util.Scanner;

public class charscan
{
	public static void main(String args[])throws IOException 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Character:");
		char a = s.next().charAt(0);
		System.out.println("Your initial is :" + a);
	}
}