import java.util.Scanner;


public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Circle aCircle = new Circle(10);
		//Circle bCircle = new Circle(10);
		
	//	System.out.println("A circle is equal to B circle " + aCircle.equals(bCircle));
//		System.out.println("a:" + aCircle.toString());
//		System.out.println("b:" + bCircle.toString());
//		
//		System.out.println("aCircle's area is " + aCircle.getArea());
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the real part a1 ");
		double a1 = input.nextDouble();
		System.out.println("Enter the imaginary part b1 ");
		double b1 = input.nextDouble();
		Complex aComplex = new Complex(a1,b1);
		double a2 = input.nextDouble();
		System.out.println("Enter the imaginary part a2 ");
		double b2 = input.nextDouble();
		System.out.println("Enter the imaginary part b2 ");
		Complex bComplex = new Complex(a2,b2);
		
		System.out.println("Get the complexa " + aComplex.plus(bComplex));
	}

}
