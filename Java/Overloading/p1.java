class example
{
	void sub(float x, int y)
	{
		System.out.println("Sum of 2 numbers: "+(x+y));
	}
	void sub(int x,int y)
	{
		System.out.println("Multiply 2 numbers: "+(x*y));
	}
}
class p1
{
	public static void main(String[] args) 
	{
		example e = new example();
		e.sub(23f,12);
		e.sub(12,12);	
	}
}