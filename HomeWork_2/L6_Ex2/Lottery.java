package L6_Ex2;

import java.util.Random;

public class Lottery
{
	Random rand = new Random();
	private int [] numbers =new int[6];
	private int strongNum;
	
	public Lottery()
	{
		int num;
		System.out.println("lottery numbers:");
		for(int i=0;i<6;i++)
		{
			num = rand.nextInt(37)+1; // 1-37
			for(int j=0;j<6;j++)
			{
				if(numbers[j]==num && j!=i)
				{
					num = rand.nextInt(37)+1; // 1-37
					j=0;
				}
			}
			numbers[i]=num;
			System.out.print(num+" ");
		}
		strongNum = rand.nextInt(7)+1; //1-7
		System.out.println("strogNum: "+strongNum);
	}
	
	
	public void isWin(int[] playerNumbers,int strongNum)
	{
		int correctNum=0;
		for(int i=0;i<6;i++)
			for(int j=0;j<6;j++)
				if(playerNumbers[i]==numbers[j])
					correctNum++;
		
		if(correctNum==6&&strongNum==this.strongNum)
		{
			System.out.println("You guessed all the numbers, you won 200,000 NIS!!");
			return;
		}
		else
			System.out.println("you guessed "+correctNum+" of the 6 numbers in the lottery");
		if(strongNum==this.strongNum)
			System.out.println("you guessed the strong number");
		else
			System.out.println("you didnt guessed the strong number");

		
		}

}
