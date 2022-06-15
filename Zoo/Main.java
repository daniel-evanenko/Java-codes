package Zoo;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList <Animal> animalsArr = new ArrayList<Animal>();
		Find_Fish_Dog_Mamal_Bird calcFunc = new Find_Fish_Dog_Mamal_Bird(animalsArr);
		int option=0;
		while(option!=-1)
		{
			System.out.println("please choose your animal or action\nfor dog press 1, for fish press 2, for bird press 3, for mamal press 4");
			System.out.println("to print the dogs name with the most bones press 5\nto print the avgrage fish swiming depth press 6\nto print the amount of mammals that consume more calories than average press 7\nto end the program press -1.");
			option = input.nextInt();
			switch (option)
			{
				case 1:
					System.out.println("please enter your dogs name, gender, amount of energy consumption, amount of milk consumption, amount of bones");
					animalsArr.add(new Dog(input.next(),input.next(),input.nextDouble(),input.nextDouble(),input.nextInt()));
					break;
				case 2:
					System.out.println("please enter the name of the fish, gender, energy consumption, type/sort of fish, swiming depth");
					animalsArr.add(new Fish(input.next(),input.next(),input.nextDouble(),input.next(),input.nextDouble()));
					break;
				case 3:
					System.out.println("please enter your birds name, gender, energy consumption, nest height");
					animalsArr.add(new Bird(input.next(),input.next(),input.nextDouble(),input.nextDouble()));
					break;
				case 4:
					System.out.println("please enter the name of the mamal, gender, energy consumption, milk consumption");
					animalsArr.add(new Mamal(input.next(),input.next(),input.nextDouble(),input.nextDouble()));
					break;
				case 5:
					calcFunc.dogBones();
					break;
				case 6:
					calcFunc.avgFishDepth();
					break;
				case 7:
					calcFunc.avgMamal();
					break;
				default:
					if(option!=-1)
						System.out.println("ERROR - please enter numbers 1-7");
					break;
					
			}
		}
		calcFunc.animalCount();
		input.close();
	}

}
