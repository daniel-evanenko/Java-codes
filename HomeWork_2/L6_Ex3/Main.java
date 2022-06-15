package L6_Ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner input = new Scanner(System.in);
		int flag=0;
		System.out.println("for addition of numbers press 1");
		System.out.println("for subtraction of numbers press 2");
		System.out.println("for Multiplication of numbers press 3");
		System.out.println("for division of numbers press 4");
		System.out.println("for power of numbers press 5");
		System.out.println("to check if a number is power of another number press 6");
		System.out.println("for sum of digits of numbers press 7");
		int num = input.nextInt();
		if(num!=6 && num!=5)
		{
			System.out.println("for float/double number press any number - if you want an integer press 0");
			flag = input.nextInt();
		}
		switch (num)
		{
			case 1:
				System.out.println("please enter 2 numbers");
				if(flag>0)
					calc.addFunc(input.nextDouble(),input.nextDouble());
				else
					calc.addFunc(input.nextInt(),input.nextInt());

				break;
			case 2:
				System.out.println("please enter 2 numbers");
				if(flag>0)
					calc.subFunc(input.nextDouble(),input.nextDouble());
				else
					calc.subFunc(input.nextInt(),input.nextInt());

				break;
			case 3:
				System.out.println("please enter 2 numbers");
				if(flag>0)
					calc.multiplication(input.nextDouble(),input.nextDouble());
				else
					calc.multiplication(input.nextInt(),input.nextInt());

				break;
			case 4:
				System.out.println("please enter 2 numbers");
				if(flag>0)
					calc.division(input.nextDouble(),input.nextDouble());
				else
					calc.division(input.nextInt(),input.nextInt());
				break;
			case 5:
				System.out.println("please enter 2 numbers");
				if(flag>0)
					calc.power(input.nextDouble(),input.nextDouble());
				else
					calc.power(input.nextInt(),input.nextInt());
				break;
			case 6:
				System.out.println("please enter 2 numbers");
				System.out.println(calc.isPower(input.nextInt(),input.nextInt()));
				break;
			case 7:
				System.out.println("please enter a number");
				calc.sumDigits(input.nextInt());
				break;
			
		}
		System.out.println("GoodBye");
		input.close();
	}

}
