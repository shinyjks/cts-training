import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class floatbuffer
{
	public static void main(String args[])throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers : ");
		float a,b,c;
		a = Float.parseFloat(reader.readLine());
		b = Float.parseFloat(reader.readLine());
		c = a + b;
		System.out.println(c);
	}
}