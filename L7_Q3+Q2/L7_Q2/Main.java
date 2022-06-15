package L7_Q2;

public class Main {

	public static void main(String[] args) {
		
		Player player1 = new Player("daniel");
		Player player2 = new Player("shirley");
		RockGame game = new RockGame(player1,player2);
		game.startGame();
		game.turn();
		game.printWinner();
	}

}
