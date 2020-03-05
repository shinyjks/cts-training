import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boolbuffer
{
	public static void main(String args[])throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter true or false : ");
		boolean a;
		a = Boolean.parseBoolean(reader.readLine());
		System.out.println(a);
	}
}