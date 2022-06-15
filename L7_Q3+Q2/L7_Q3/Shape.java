package L7_Q3;

public abstract class Shape {
	
	protected double [] points;
	protected int pointsAmount;
	
	public Shape(double points [] ,int pointsAmount)
	{
		this.points = new double[pointsAmount];
		setPoints(points);
	}

	public double[] getPoints() {
		return points;
	}

	public void setPoints(double[] points)
	{
		for(int i=0;i<pointsAmount;i++)
			this.points[i] = points[i];
	}
	
	public abstract void shapeName();
	public abstract double getArea();
	public abstract void getPerimeter();
	public abstract void printShape();
}
