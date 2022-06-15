import java.util.Random;
public class HomeWork_Q4 {

	public static void main(String[] args) {
		Random rand = new Random();
		int dice1=0,dice2=1;
		while(dice1!=dice2)
		{
			dice1 = rand.nextInt(6)+1; // 1-6
			dice2 = rand.nextInt(6)+1;
		}
		System.out.println("the winner is number: "+dice1); // dice1 or dice2, there are the same
		

	}

}
