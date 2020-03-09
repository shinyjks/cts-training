import java.io.*;

class labledcontinue
{
	public static void main(String args[])
	{
		Outer:
			for(int i = 0; i < 5; i++)
			{
				for(int j = 0; j < 5; j++)
				{
					if(j == 2)
						continue Outer;
					System.out.println("i = "+i+",j = "+j+"\n");
				}
			}
	}
}