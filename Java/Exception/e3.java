import java.io.*;
import java.util.*;


class e3
{
	public static void main(String[] args)throws IOException
	{
		int a[] = {0,0};
		int n1, n2, result = 0;
		n1 = 100;
		n2 = 0;

		try
		{
			//result = n1 / n2;
			System.out.println(n1/a[2]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Zero divide by Error");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Given Index Not Found in the Array");
		}
		finally
		{
			System.out.println("Good Bye");
		}
	}
}