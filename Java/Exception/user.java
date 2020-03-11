class joy extends Exception
{

}
class triangle
{
	double b,h;
	triangle(double l, double m)
	{
		b = l;
		h = m;
	}
	public void area()throws joy
	{
		if(b <= 0 || h <= 0)
			throw new joy();
		else
			System.out.println("Area = "+0.5*b*h);
	}
}
class user
{
	public static void main(String[] args) 
	{
		triangle t = new triangle(0,50);
		try
		{
			t.area();
		}
		catch(joy e)
		{
			System.out.println("Length or Breadth should not be less than or equal to zero");
		}
	}
}