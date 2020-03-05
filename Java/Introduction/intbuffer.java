import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class intbuffer
{
	public static void main(String args[])throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers : ");
		int a,b,c;
		a = Integer.parseInt(reader.readLine());
		b = Integer.parseInt(reader.readLine());
		c = a + b;
		System.out.println(c);
	}
}