import java.io.*;

public class boolcon
{
	public static void main(String args[])throws IOException
	{
		Console cio = System.console();
		System.out.println("Enter true or false : ");
		boolean a;
		a = Boolean.parseBoolean(cio.readLine());
		System.out.println(a);
	}
}