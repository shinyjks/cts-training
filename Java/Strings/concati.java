import java.io.*;

public class concati
{
	public static void main(String[] args)throws IOException 
	{
		String str1 = "Hello";
		String str2 = "Welcome";
		String str3 = str1.concat(str2);
		System.out.println("Concatenation of Two String is ::: " + str3);
	}
}