import java.io.*;

public class charcon
{
	public static void main(String args[])throws IOException
	{
		Console cio = System.console();
		System.out.println("Enter a Character : ");
		char a;
		a = (char) cio.read();
		System.out.println("Your initial is "+a);
	}
}