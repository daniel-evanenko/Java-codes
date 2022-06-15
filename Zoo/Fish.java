package Zoo;

public class Fish extends Animal
{
	protected String type;
	protected double depth;
	private static double MAX_DEPTH = 800;
	public Fish(String name , String gender, double energy,String type,double depth)
	{
		super(name ,gender,energy);
		this.type=type;
		setDepth(depth);
	}
	public void setDepth(double depth)
	{
		if(depth>MAX_DEPTH)
			this.depth=800;
		else
			this.depth = depth;
	}
	
	public double depth()
	{
		return(MAX_DEPTH-this.depth);
	}
	public double getDepth()
	{
		return depth;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString()
	{
		return("name: "+this.name+" gender: "+this.gender+" energey: "+this.energy+" type: "+type+" depth "+depth);
	}
	
}
