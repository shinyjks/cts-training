import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class charbuffer
{
	public static void main(String args[])throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Character : ");
		char a;
		a = (char)reader.read();
		System.out.println("Your initial is "+a);
	}
}