package L5_Q2;

public class Circle
{
	private double radius;
	
	public Circle()
	{
		this.radius = 1.0;
	}
	public Circle(double radius)
	{
		setRadius(radius);
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		if(radius>0)
			this.radius = radius;
		else
			this.radius = 1.0;
	}
	
	public double getCircumference()
	{
		return(2*3.14*this.radius); // 2*PI*Radius
	}
	
	public double getArea()
	{
		return(3.14*(this.radius*this.radius));// PI*Radius2 
	}
	
}
