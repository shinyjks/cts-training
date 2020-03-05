import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class longbuffer
{
	public static void main(String args[])throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers : ");
		long a,b,c;
		a = Long.parseLong(reader.readLine());
		b = Long.parseLong(reader.readLine());
		c = a + b;
		System.out.println(c);
	}
}