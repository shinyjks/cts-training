public class strtrim
{
	public static void main(String[] args) 
	{
		String str1 = "   SRM Institute of Science and Technology   ";
		String str2 = str1.trim();

		System.out.println("Original String : "+str1);
		System.out.println("New String : "+str2);
	}
}

/* Output:

Original String :    SRM Institute of Science and Technology
New String : SRM Institute of Science and Technology

*/