package L5_Q3;

public class Triangle
{
	private double pointA;
	private double pointB;
	private double pointC;
	public Triangle()
	{
		this.pointA=1;
		this.pointB=1;
		this.pointC=1;
	}
	public Triangle(double pointA, double pointB, double pointC)
	{
		setPointA(pointA);
		setPointB(pointB);
		setPointC(pointC);
	}
	public double getPointA()
	{
		return pointA;
	}
	public void setPointA(double pointA)
	{
		if(pointA>0)
			this.pointA = pointA;
		else
			this.pointA = 1.0;

	}
	public double getPointB()
	{
		return pointB;
	}
	public void setPointB(double pointB)
	{
		if(pointB>0)
			this.pointB = pointB;
		else
			this.pointB = 1;
	}
	public double getPointC()
	{
		return pointC;
	}
	public void setPointC(double pointC)
	{
		if(pointC>0)
			this.pointC = pointC;
		else
			this.pointC = 1;
	}
	
	public boolean checkTriangle()
	{
		// a+b>c, b+c>a, c+a<b
		if(this.pointA+this.pointB > this.pointC && this.pointB+this.pointC > this.pointA && this.pointC+this.pointA > this.pointB)
			return true;
		else
			return false;
	}
	

	

}
