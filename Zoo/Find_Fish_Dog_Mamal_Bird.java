package Zoo;
import java.util.ArrayList;

public class Find_Fish_Dog_Mamal_Bird 
{
	private ArrayList<Animal> animalsArr;
	
	public Find_Fish_Dog_Mamal_Bird(ArrayList<Animal> animalsArr)
	{
		this.animalsArr = animalsArr;
	}
	
	public void avgFishDepth()
	{
		double avg = 0.0;
		int len=0; // amount of fishes
		for(int i=0;i<animalsArr.size();i++)
		{
			if(animalsArr.get(i) instanceof Fish)
			{
				avg+=((Fish)animalsArr.get(i)).getDepth();
				len++;
			}
		}
		if(len==0)
			System.out.println("there is no fishes");
		else
		{
			avg/=len;
			System.out.println("the avrage fish depth is: "+avg);
		}	
	}
	
	public void dogBones()
	{
		int bones=-1;
		String name = null;
		for(int i=0;i<animalsArr.size();i++)
		{
			if(animalsArr.get(i) instanceof Dog)
			{
				if(((Dog)animalsArr.get(i)).getBones()>bones)
				{
					bones=((Dog)animalsArr.get(i)).getBones();
					name = ((Dog)animalsArr.get(i)).getName();
				}
				
			}
		}
		if(name == null)
			System.out.println("there is no dogs");
		else
			System.out.println("the name of the dog that has the most bones is: "+name);
	}
	
	public void avgMamal()
	{
		double calAvg = 0.0;
		int len=0; // amount of mamals
		int count=0; // amount of mamals above avg
		for(int i=0;i<animalsArr.size();i++)
		{
			if(animalsArr.get(i) instanceof Mamal)
			{
				calAvg+=((Mamal)animalsArr.get(i)).milkCaloris();
				len++;
			}
		}
		if(len==0)
		{
			System.out.println("there is no mamals");
			return;
		}
		
		calAvg/=len;
		for(int i=0;i<animalsArr.size();i++)
		{
			if(animalsArr.get(i) instanceof Mamal)
				if(((Mamal)animalsArr.get(i)).milkCaloris()>calAvg)
					count++;
		}
		
		System.out.println("the amount of mammals that consume above average calories is: "+count);
	}
	
	public void animalCount()
	{
		int dogCnt=0;
		int fishCnt=0;
		int birdCnt=0;
		int mamalCnt=0;
		for(int i=0;i<animalsArr.size();i++)
		{
			if(animalsArr.get(i) instanceof Fish)
				fishCnt++;
			if(animalsArr.get(i) instanceof Dog)
				dogCnt++;
			if(animalsArr.get(i) instanceof Mamal)
				mamalCnt++;
			if(animalsArr.get(i) instanceof Bird)
				birdCnt++;
		}
		
		System.out.println("amount of fish: "+fishCnt+"\namount of dogs: "+dogCnt+"\namount of birds: "+birdCnt+"\namount of mamals: "+mamalCnt);
	}
}
