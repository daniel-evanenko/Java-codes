package L5_Q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Human daniel = new Human("207260936","daniel",11,4,1999);
		System.out.println("id: "+daniel.getId()+" name: "+daniel.getName()+" birthDay: "+daniel.getDay()+"/"+daniel.getMonth()+"/"+daniel.getYear()+" age: "+daniel.getAge());
		daniel.birthDay();
		System.out.println("age after birthday: "+daniel.getAge());
		
		System.out.println("please enter how many students there are");
		int N = input.nextInt();
		int i;
		Human[] students = new Human[N];
		for(i=0;i<N;i++)
		{
			System.out.println("please enter your id");
			students[i].setId(input.next());
			System.out.println("please enter your name");
			students[i].setName(input.next());
			System.out.println("please enter your birthday (day,month,year - seperate)");
			students[i].setDay(input.nextInt());
			students[i].setMonth(input.nextInt());
			students[i].setYear(input.nextInt());
		}

		
		
	}

}
