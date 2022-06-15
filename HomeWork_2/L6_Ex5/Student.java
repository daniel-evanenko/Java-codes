package L6_Ex5;

import java.util.Scanner;

public class Student
{
	private String id;
	private String fullName;
	private int finalGrade;
	Scanner input = new Scanner(System.in);
	public Student(String id, String fullName)
	{
		setId(id);
		setFullName(fullName);
		finalGrade = 0;
	}
	
	
	private void setId(String id)
	{
		boolean vaild = false;
		while(!vaild)
		{
			for(int i=0;i<id.length();i++)
			{
				if((id.charAt(i)<'0' || id.charAt(i)>'9') && id.length()!=9)
				{
					System.out.println("please enter a vaild id");
					id = input.next();
					i=0;
				}
				else
					vaild=true;
			}	
		}
		this.id=id;
	}
	
	private void setFullName(String name)
	{
		if(name.length()<0)
		{
			System.out.println("please enter your name");
			name=input.nextLine();
		}
		for(int i=0;i<name.length();i++)
			{
				while((name.charAt(i)<'a' || name.charAt(i)>'z') && name.charAt(i)!=' ' )
				{
					System.out.println("please enter valid name, (a-z) only");
					name=input.nextLine();
				}
			}
			this.fullName += name;
	}
	
	
	public void homeWork(int amount)
	{
		while(amount<0 || amount>4)
		{
			System.out.println("ERROR - there are only 4 Homework - enter again");
			amount = input.nextInt();
		}
		amount*=25;
		finalGrade+= (amount*0.2); // 20%
	}
	
	
	public void presence(double presence)
	{
		while(presence<0 || presence>14)
		{
			System.out.println("ERROR - there are only 14 lectues - enter again");
			presence = input.nextInt();
		}
		
		finalGrade+= (((presence/14)*100)*0.1);
	}
	
	public void exams(int exam1, int exam2)
	{
		while((exam1<0 || exam1>100) && (exam2<0 || exam2>100))
		{
			System.out.println("ERROR - please enter your grades again.");
			exam1 = input.nextInt();
			exam2 = input.nextInt();
		}
		if(exam1>exam2)
			finalGrade+=(exam1*0.7);
		else
			finalGrade+=(exam2*0.7);
	}
	
	
	public void printStudent()
	{
		System.out.println("ID: "+id+" name: "+fullName+" finalGrade: "+finalGrade);
	}
}
