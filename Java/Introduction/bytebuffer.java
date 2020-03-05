import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bytebuffer
{
	public static void main(String args[])throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers : ");
		byte a,b,c;
		a = Byte.parseByte(reader.readLine());
		b = Byte.parseByte(reader.readLine());
		c = (byte)(a + b);
		System.out.println(c);
	}
}