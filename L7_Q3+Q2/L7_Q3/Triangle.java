package L7_Q3;

public class Triangle extends Shape {
	private double area;

    public Triangle(int pointsAmount,double points[])
    {
    	super(points,pointsAmount);
    }
    
    public void Area() {
        area = (points[1]+points[2]+points[3]) / 2;
    }
    
    public void shapeName()
    {
    	System.out.println("shape name: triangle");
    }
    
    public void printShape()
    {
    	System.out.println("edegs = 3, points = 3, angles = 3");
    }

}