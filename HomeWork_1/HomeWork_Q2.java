import java.util.Scanner;

public class HomeWork_Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] names;
		String temp;
		int i,numOfPepole,tripTime,n=20;
		System.out.println("please enter how many pepole went on a trip");
		numOfPepole = input.nextInt();
		names = new String[numOfPepole];
		System.out.println("please enter how much time you were in the trip (in minuts)");
		tripTime = input.nextInt();
		for(i=0;i<numOfPepole;i++)
		{
			System.out.println("please enter the name of the person in "+(i+1)+"th place in the row");
			names[i] = input.next();
		}
		if(tripTime>=n)
		{
			while(tripTime>=20)
			{	
				tripTime-=n;
				temp = names[0];
				for(i=0;i<numOfPepole-1;i++)
					names[i]=names[i+1];
				names[numOfPepole-1]=temp;
			}	
		}
		System.out.print("the order of the row in the end of the trip: ");
		for(i=0;i<numOfPepole;i++)
			System.out.print(names[i]+" ");
		input.close();
		
	}

}
