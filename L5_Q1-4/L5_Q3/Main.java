package L5_Q3;

public class Main {

	public static void main(String[] args) {
		Triangle triangle  = new Triangle(1,7,9);
		if(triangle.checkTriangle())
			System.out.println("Vaild Triangle");
		else
			System.out.println("Not Vaild Triangle");

	}

}
