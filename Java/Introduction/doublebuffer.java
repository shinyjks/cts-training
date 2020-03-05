import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class doublebuffer
{
	public static void main(String args[])throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers : ");
		double a,b,c;
		a = Double.parseDouble(reader.readLine());
		b = Double.parseDouble(reader.readLine());
		c = a + b;
		System.out.println(c);
	}
}