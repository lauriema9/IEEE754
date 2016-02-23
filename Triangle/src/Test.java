import java.util.Scanner;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter color: ");
		String color = input.next();
		System.out.println("Filles?: ");
		boolean filled = input.nextBoolean();
		GeometricObject geometricObject = new GeometricObject(color,filled);
		Triangle triangle = new Triangle(1.0,1.0,1.0);
		System.out.println("the area of triangle is " + triangle.getArea());
		System.out.println("the color is " + geometricObject.toString());
		
    
   
    
	}

}
