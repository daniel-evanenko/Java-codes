package L7_Q2;

public abstract class Game
{
	protected Player player1;
	protected Player player2;
	
	public Game(Player player1, Player player2)
	{
		this.player1 = player1;
		this.player2 = player2;
		
	}
	
	public void startGame()
	{
		System.out.println("Start game");
		player1.setPoints(0);
		player2.setPoints(0);
	}
	
	public void endGame()
	{
		printPlayerPoints();
		printWinner();
	}
	
	public void printWinner()
	{
		if(player1.getPoints()>player2.getPoints())
			System.out.println("the winner is: "+player1.getName());
		else if(player2.getPoints()>player1.getPoints())
			System.out.println("the winner is: "+player2.getName());
		else
			System.out.println("No winner!");
	}
	 public void printPlayerPoints()
	 {
		 System.out.println(player1.getName()+" points: "+player1.getPoints());
		 System.out.println(player2.getName()+" points: "+player2.getPoints());
	 }
	 
	 public abstract void turn();
	 public abstract void updatePoints();
	 
	
	
}
