package L6_Ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Lottery ticket = new Lottery();
		int [] playerNumbers =new int[6];
		int i,num=-1,strongNum=-1;
		System.out.println("do you have a lottery ticket? press any number - if not enter 0");
		int option = input.nextInt();
		
		while(option!=0)
		{
			for(i=0;i<6;i++)
			{
				while(num<=0 || num>37)
				{
					System.out.println("please enter your "+(i+1)+"th number between 1-37");
					num = input.nextInt();
				}
				playerNumbers[i] = num;
				num=-1;
			}
			while(strongNum<=0 || strongNum>7)
				{
					System.out.println("please enter your strong number between 1-7");
					strongNum = input.nextInt();
				}
			ticket.isWin(playerNumbers, strongNum);
			System.out.println("do you have another lottery ticket? - if not enter 0");
			option = input.nextInt();
			strongNum=-1;
		}
		System.out.println("GoodBye");
		input.close();
		}
	}

