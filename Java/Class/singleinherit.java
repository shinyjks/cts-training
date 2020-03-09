class world
{
	String name;
	float weight;

	public void read(String k, float l)
	{
		name = k;
		weight = l;
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Weight : "+weight);
	}
}
class living extends world
{
	String lname;
	int lno;

	public void read(String k, float l,String m, int n)
	{
		read(k,l);
		lname = m;
		lno = n;
	}
	public void displayl()
	{
		display();
		System.out.println("Living name : "+lname);
		System.out.println("Living no : "+lno);
	}
}
class singleinherit
{
	public static void main(String args[])
	{
		living l = new living();
		l.read("India",10.00f);
		l.display();

		l.read("Russia", 90.0f, "Russians", 1001);
		l.displayl();
	}
}