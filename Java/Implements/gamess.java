interface cricket
{
	int p1 = 11;
	int p2 = 1;
}
class game implements cricket
{
	public void display()
	{
		System.out.println("Number of players:::"+p1);
		System.out.println("Number of keepers:::"+p2);
	}
}
class gamess
{
	public static void main(String[] args) {
		game g = new game();
		g.display();
	}
}