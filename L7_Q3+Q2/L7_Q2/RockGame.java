package L7_Q2;

import java.util.Scanner;

public class RockGame extends Game
{
	private int winner;
	public RockGame(Player player1, Player player2)
	{
		super(player1, player2);
		
	}

	@Override
	public void turn()
	{
		Scanner input = new Scanner(System.in);
		System.out.println(player1.getName()+" Enter 1-Rock, 2-Scissors, 3-Paper");
		int choice1 = input.nextInt();
		System.out.println(player2.getName()+" Enter 1-Rock, 2-Scissors, 3-Paper");
		int choice2 = input.nextInt();
		
		if(choice1 !=choice2 )
		{
			if(choice1==1 && choice2 == 2 || choice1 == 2 && choice2 == 3 || choice1 ==3 && choice2==1)
			{
				winner=1;
				updatePoints();
			}
			else
			{
				winner=2;
				updatePoints();
			}
		}
	}

	@Override
	public void updatePoints()
	{
		if(winner==1)
			player1.updatePoints(1);
		else
			player2.updatePoints(1);
		
	}
	
}
