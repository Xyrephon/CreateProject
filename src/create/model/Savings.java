package create.model;

public class Savings extends Account implements Transaction
{
	public Savings()
	{
		super("Savings");
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
