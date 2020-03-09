class student
{
	String name;
	int no;

	public void read(String k, int l)
	{
		name = k;
		no = l;
	}
	public void display()
	{
		System.out.println("Student name : "+name);
		System.out.println("Student no : "+no);
	}
}
class maths extends student
{
	int mno;
	public void readm(String a, int m, int n)
	{
		read(a,m);
		mno = n;
	}
	public void displaym()
	{
		display();
		System.out.println("Maths no : "+mno);
	}
}
class chemistry extends student
{
	int cno;
	public void readc(String a, int m, int d)
	{
		read(a,m);
		cno = d;
	}
	public void displayc()
	{
		display();
		System.out.println("Chemistry no : "+cno);
	}
}
class hierarchical
{
	public static void main(String args[])
	{
		maths m = new maths();
		m.readm("Ram", 25, 46);
		m.displaym();

		chemistry c = new chemistry();
		c.readc("Kumar", 42, 90);
		c.displayc();
	}
}