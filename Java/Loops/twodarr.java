class twodarr
{
	public static void main(String args[])
	{
		int a[][] = new int[][]{{1,2},{2,3}};
		Outer:
			for(int i = 0; i < a.length; i++)
			{
				for(int j = 0; j < a[i].length; j++)
				{
					if(a[i][j] == 3)
						continue Outer;
					System.out.println("Element is : "+a[i][j]);
				}
			}

	}
}