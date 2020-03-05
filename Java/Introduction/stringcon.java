import java.io.*;

public class stringcon
{
	public static void main(String args[])throws IOException
	{
		Console cio = System.console();
		System.out.println("Enter a string : ");
		String a = cio.readLine();
		System.out.println(a);
	}
}