package L6_Ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("to make a profile please enter your name,hight and weight");
		DataFitness orit = new DataFitness(input.next(), input.nextInt(),input.nextDouble());
		System.out.println("next profile.");
		DataFitness galit = new DataFitness(input.next(), input.nextInt(),input.nextDouble());
		System.out.println("next profile.");
		DataFitness dana = new DataFitness(input.next(), input.nextInt(),input.nextDouble());

		System.out.println("evrey week you need to update your stats");
		for(int i=1;i<52;i++)
		{
			System.out.println(orit.getName()+" please enter your hight and weight");
			orit.addData(input.nextInt(),input.nextDouble());
			System.out.println(galit.getName()+" please enter your hight and weight");
			galit.addData(input.nextInt(),input.nextDouble());
			System.out.println(dana.getName()+" please enter your hight and weight");
			dana.addData(input.nextInt(),input.nextDouble());
		}
		orit.printProfile();
		galit.printProfile();
		dana.printProfile();
		
	input.close();
	}
}
