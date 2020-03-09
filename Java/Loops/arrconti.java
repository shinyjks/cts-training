class arrconti
{
	public static void main(String args[])
	{
		/*Continue Statement is used to skip a particular iteration of the loop*/

		int a[] = new int[]{1,2,3,4,5};

		System.out.println("All numbers except 3 are: ");
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == 3)
				continue;
			else
				System.out.println(a[i]);
		}
	}
}