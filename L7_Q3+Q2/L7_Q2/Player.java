package L7_Q2;

public class Player
{
	private String name;
	private int points;
	
	public Player(String name)
	{
		this.name = name;
		points = 0;
	}
	
	public String getName()
	{
		return name;
	}

	public int getPoints()
	{
		return points;
	}	
	
	public void updatePoints(int points)
	{
		this.points += points;
	}

	public void setPoints(int points)
	{
		this.points = points;
	}
	
	
}
