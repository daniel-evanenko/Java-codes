package L6_Ex5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student []students = new Student[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("please enter your id and your full name");
			students[i] = new Student(input.next(),input.nextLine());
			System.out.println("please enter the amount of homeWork you did");
			students[i].homeWork(input.nextInt());
			System.out.println("please enter your attendance at lectures");
			students[i].presence(input.nextInt());
			System.out.println("please enter your grades in exam 1 and exam2");
			students[i].exams(input.nextInt(),input.nextInt());
			students[i].printStudent();
		}
		input.close();

	}

}
