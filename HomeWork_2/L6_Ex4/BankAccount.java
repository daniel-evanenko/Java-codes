package L6_Ex4;

import java.util.Scanner;

public class BankAccount
{	
	private String name;
	private double balance;
	Scanner input = new Scanner(System.in);

	public BankAccount(String name,double balance)
	{
		setName(name);
		this.balance = balance;
	}

	private void setName(String name)
	{
		if(name.length()>0)
		{
			for(int i=0;i<name.length();i++)
			{
				while((name.charAt(i)<'a') || (name.charAt(i)>'z'))
				{
					System.out.println("please enter valid name, (a-z) only");
					name=input.next();
				}
			}
		}
			this.name = name;
	}
	public void transfer(BankAccount account, double amount)
	{
		account.balance += amount;
		balance -= amount;
		System.out.println("you transferd "+amount+" NIS" + " to " +account.getName()+". your balance is: "+balance+ " and "+account.getName()+" balance is: "+account.getBalance());
	}
	public void deposit(double money)
	{
		balance+=money;
	}
	
	public void withRawal(double money)
	{
		balance-=money;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}

	public void printAccount()
	{
		System.out.println("hello "+name+" your balance is: "+balance);
	}
	
}
