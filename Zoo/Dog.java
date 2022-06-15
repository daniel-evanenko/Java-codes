package Zoo;

public class Dog extends Mamal 
{
	protected int bones;
	public Dog(String name , String gender, double energy,double milk, int bones)
	{
		super(name ,gender,energy,milk);
		this.bones = bones;
	}
	
	public int getBones() 
	{
		return bones;
	}
	
	public void setBones(int bones)
	{
		this.bones = bones;
	}
	
	public boolean checkBones(int bones, String gender)
	{
		return(bones>5 && gender.equals("female"));
	}
	@Override
	public String toString()
	{
		return("name: "+this.name+" gender: "+this.gender+" energey: "+this.energy+" milk: "+this.milk+" bones: "+bones);
	}
}
