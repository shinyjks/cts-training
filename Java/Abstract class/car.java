abstract class car
{
	int regno;
	car(int r)
	{
		regno = r;
	}
	void openTank()
	{
		System.out.println("Fill the tank");
	}
	abstract void steering(int direction, int angle);
	abstract void braking(int force);
}

class maruthi
{
	maruthi(int regno)
	{
		super(regno);
	}
	void steering(int direction, int angle)
	{
		System.out.println("Take a turn");
		System.out.println("This is ordinary steering");
	}
	void braking(int force)
	{
		System.out.println("Brakes applied");
		System.out.println("This car uses gas brakes");
	}
}
class santro
{
	santro(int regno)
	{
		super(regno);
	}
	void steering(int direction, int angle)
	{
		System.out.println("Take a turn");
		System.out.println("This is ordinary steering");
	}
	void braking(int force)
	{
		System.out.println("Brakes applied");
		System.out.println("This car uses gas brakes");
	}
}
class car
{
	public static void main(String args[])
	{
		maruthi m = new maruthi(1001);
		santro s = new santro(5005);
		car ref;
		ref = m;
		ref.openTank();
		ref.steering(1,90);
		ref.braking(500);
		ref = s;
		ref.openTank();
	}
}