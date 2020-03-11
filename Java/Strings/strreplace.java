public class strreplace
{
	public static void main(String[] args) 
	{
		String str = "Black Rose";

		/* Replaces all occurences of given character with new one and returns new string object*/
		System.out.println(str.replace('B','R'));

		/*Replaces only first occurence of given String with one and returns new string object*/
		System.out.println(str.replaceFirst("Bl","Ro"));

		/*Replaces all occurences of the given string with new one and returns new string object*/
		System.out.println(str.replaceAll("se","ja"));
	}
}