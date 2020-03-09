class box
{
	double height,width,depth;
	box()
	{
		height = 2;
		width = 3;
		depth = 4;
	}
	public double volume()
	{
		return (height*width*depth);
	}
}
class c1
{
	public static void main(String args[])
	{
		box b1 = new box();
		System.out.println("Volume of b1 = "+b1.volume());

		box b2 = new box();
		System.out.println("Volume of b1 = "+b2.volume());
	}
}
//javap class_name - to check the constructor in cmd.