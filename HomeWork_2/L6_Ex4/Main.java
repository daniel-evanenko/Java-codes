package L6_Ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		BankAccount []accounts = new BankAccount[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("please enter your name and how much money do you want to deposit to your bankAccount");
			accounts[i] = new BankAccount(input.next(),input.nextDouble());
			accounts[i].printAccount();
			System.out.println("please enter how much money do you want to withdraw");
			accounts[i].withRawal(input.nextDouble());
			accounts[i].printAccount();
			System.out.println("please enter how much money do you want to diposet");
			accounts[i].deposit(input.nextDouble());
			accounts[i].printAccount();
		}

			System.out.println("please enter how much money do you want to transfer to "+accounts[1].getName());
			accounts[0].transfer(accounts[1], input.nextDouble());
			System.out.println("please enter how much money do you want to transfer to "+accounts[0].getName());
			accounts[1].transfer(accounts[0], input.nextDouble());
			input.close();

	}

}
