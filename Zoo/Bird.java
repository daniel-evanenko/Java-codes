package Zoo;

public class Bird extends Animal
{
	protected double nestHeight;
	public Bird(String name, String gender, double energy,double nestHeight)
	{
		super(name, gender, energy);
		this.nestHeight = nestHeight;
	}
	
	public double getNestHeight() {
		return nestHeight;
	}

	public void setNestHeight(double nestHeight) {
		this.nestHeight = nestHeight;
	}

	@Override
	public String toString()
	{
		return("name: "+this.name+" gender: "+this.gender+" energey: "+this.energy+" nesthight: "+this.nestHeight);
	}

	
}
