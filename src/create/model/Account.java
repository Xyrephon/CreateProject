package create.model;

public abstract class Account 
{
	private int money;
	private String date;
	private String name;
	
	public Account(String name)
	{
		this.name = name;
		this.money = 0;
	}
	
	public String toString()
	{
		return name;
	}

	public int getMoney() 
	{
		return money;
	}

	public void setMoney(int money) 
	{
		this.money = money;
	}

	public String getDate() 
	{
		return date;
	}

	public void setDate(String date) 
	{
		this.date = date;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

}
