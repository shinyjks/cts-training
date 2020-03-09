class A
{
	int a,b;
	public void read(int l, int m)
	{
		a = l;
		b = m;
	}
	public void disp()
	{
		System.out.println("Value : "+a);
		System.out.println("Value : "+b);
	}
}
class B extends A
{
	int a,b;
	public void read(int k,int i, int s, int t)
	{
		super.read(k,i);
		a = s;
		b = t;
	}
	public void disp()
	{
		super.disp();
		System.out.println("Value : "+a);
		System.out.println("Value : "+b);
	}
}
class superr
{
	public static void main(String args[])
	{
		B b = new B();
		b.read(5,6,7,8);
		b.disp();
	}
}