import java.util.Random;

public class HomeWork_Q1 {
 // 0 = regular cube, 1 = bomb cube, 2 = prize cube
	public static void main(String[] args) {
		int i, diceNum, playerIndex=0,playerPoints = 100, n=100;
		int [] gameBoard =new int[n];
		Random rand = new Random();
		for(i=0;i<n;i++)
			gameBoard[i]=rand.nextInt(3); //0-2
		System.out.println("hello and welcome to the game.");
		while(playerPoints>0 && playerIndex<n)
		{
			diceNum = rand.nextInt(6)+1; //1-6 random value of the cube (player moves)
			switch (gameBoard[playerIndex]) // the spesific cube the player standing on
			{
				case 0: // regular cube
					if(playerIndex+diceNum<n) // if the playerIndex is not over the gameBoard area
						playerIndex+=diceNum; // move the player to the next index.
					else
						playerIndex=n;
					break;
				case 1: // bomb cube
					if(playerIndex-6 >0) // if the playerIndex is not steping out of the gameBoard area
						playerIndex-=6; // move the player to the next index.
					else
						playerIndex=0; // if the player is steping out of the gaming board reset his index to 0.
					playerPoints-=10; // take 10 points from the player.
					break;
				case 2: // prize cube
					if(playerIndex+diceNum<n) // if the playerIndex is not over the gameBoard area
						playerIndex+=diceNum; // move the player to the next index.
					else
						playerIndex=n;
					playerPoints+=5; // give 5 points to the player.
					break;
				  default:
					    System.out.println("ERROR\n");
			}	
		}
		if(playerPoints>0)
			System.out.println("you won the game!! and scored "+playerPoints+" points!!");
		else
			System.out.println("sorry.. you lost the game");
		
			

	}

}
