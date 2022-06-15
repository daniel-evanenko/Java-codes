package L6_Ex1;

import java.util.Scanner;

public class DataFitness
{
	private int N =52;
	private String name;
	private int[] hight = new int[N];
	private double[] weight = new double[N];
	private int i=0;
	Scanner input = new Scanner(System.in);


	public DataFitness(String name, int hight, double weight)
	{
		setName(name);
		setHight(hight);
		setWeight(weight);
		i++;
		
	}
	public String getName() {
		return name;
	}
	public void addData(int hight, double weight)
	{
		setHight(hight);
		setWeight(weight);
		i++;
		
	}
	public void setName(String name)
	{
		if(name.length()>0)
		{
			for(int i=0;i<name.length();i++)
			{
				while(name.charAt(i)<'a' || name.charAt(i)>'z')
				{
					System.out.println("please enter valid name, (a-z) only");
					name=input.next();
				}
			}
		}
			this.name = name;
	}

	public void setHight(int hight)
	{
		if(i>0)
		{
			while(hight<this.hight[i-1] || hight<0)
			{
				System.out.println("ERROR - please enter your hight again");
				hight = input.nextInt();
			}
		}
		this.hight[i] = hight;
	}
	public void setWeight(double weight)
	{
		while(weight<0)
		{
			System.out.println("ERROR - please enter your weight again");
			weight = input.nextInt();
		}
		this.weight[i] = weight;
	}
	
	public void printProfile()
	{
		System.out.println("name: "+name+" your hight: "+hight[N-1]+"cm"+ " your weight: "+weight[N-1]+"kg");
	}
}
