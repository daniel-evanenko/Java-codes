import java.util.Scanner;

public class HomeWork_Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int StudentsNum , i, vote, winner , winIndex;
		int [] representatives = new int[4];
		String[] names = {"roti", "ali", "aviv", "ofir"};
		System.out.println("please enter how many students are in class");
		StudentsNum = input.nextInt();
		for(i=0;i<StudentsNum;i++)
		{
			System.out.println("please chose your contestant. for roti press 1, for ali press 2, for aviv press 3, for ofir press 4");
			vote = input.nextInt();
			while(vote<0 || vote >4)
			{
				System.out.println("ERROR - please chose a number from 1-4.");
				vote = input.nextInt();
			}
			representatives[vote-1]++;
		}
		winner=representatives[0];
		winIndex=0;
		for(i=0;i<4;i++)
			if(representatives[i]>winner)
			{
				winner = representatives[i];
				winIndex=i;
			}
				
		System.out.println("The representative chosen by the students is - "+names[winIndex]);
	input.close();
	}
	

}
