class account
{
	int accno;
	double balance;

	account()
	{
		accno = 0;
		balance = 0.0;
	}
	account(int an)
	{
		accno = an;
		balance = 0.0;
	}
	account(int an, double k)
	{
		accno = an;
		balance = k;
	}
	public void read(int an, double k)
	{
		accno = an;
		balance = k;
	}
	public void display()
	{
		System.out.println("Account name : "+accno);
		System.out.println("Balance : "+balance);
	}
}
class bankc4
{
	public static void main(String args[])
	{
		account a1 = new account();
		a1.display();

		account a2 = new account(5);
		a2.display();

		account a3 = new account(10,500);
		a3.display();

		a3.read(15,1000);
		a3.display();
	}
}