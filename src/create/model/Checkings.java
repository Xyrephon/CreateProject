package create.model;

public class Checkings extends Account implements Transaction 
{
	public Checkings(int name, int amount)
	{
		super("Checkings");
	}
	
	public int withdraw(int amount)
	{
		return amount;
	}

	public int deposit(int amount)
	{
		return amount;
	}
}
