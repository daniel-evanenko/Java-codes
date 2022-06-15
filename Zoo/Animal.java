package Zoo;
public class Animal 
{
	protected String name;
	protected String gender;
	protected double energy;
	
	public Animal(String name , String gender, double energy)
	{
		this.name = name;
		this.gender = gender;
		this.energy = energy;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public double getEnergy() {
		return energy;
	}

	@Override
	public String toString()
	{
		return("name: "+this.name+" gender: "+this.gender+" energey: "+this.energy);
	}
	
	
}
