//final class

final class Bank{
void password()
{
	long password=33889;
}
}

public class Account extends Bank{
	void password()
	{
		long password=25562;
	}
	public static void main(String args[])
	{
		Account print = new Account();
		print.password();
	}
}
