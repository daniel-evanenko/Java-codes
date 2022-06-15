package L5_Q2;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(6.0);
		Circle circle1 = new Circle();
		System.out.println("the radius: "+circle.getRadius());
		System.out.println("the Circumference :"+circle.getCircumference());
		System.out.println("the area: "+circle.getArea());
		
		System.out.println("the radius: "+circle1.getRadius());
		System.out.println("the Circumference :"+circle1.getCircumference());
		System.out.println("the area: "+circle1.getArea());

	}

}
