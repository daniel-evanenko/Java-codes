package Zoo;

public class Mamal extends Animal
{
	protected double milk;
	protected static double CAL_IN_MILK = 500;
	public Mamal(String name , String gender, double energy,double milk)
	{
		super(name ,gender,energy);
		this.milk = milk;
	}
	public void setMilk(double milk) {
		this.milk = milk;
	}
	
	public double getMilk() {
		return milk;
	}
	public double milkCaloris()
	{
		return (milk*CAL_IN_MILK);
	}
	@Override
	public String toString()
	{
		return("name: "+this.name+" gender: "+this.gender+" energey: "+this.energy+" milk: "+this.milk);
	}
}
