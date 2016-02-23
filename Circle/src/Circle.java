
public class Circle{

	/**
	 * @param args
	 */
//	double radius;
//	public Circle() {
//		
//	}
//	public Circle(double radius){
//		this.radius = radius;
//	}
//	
//	public double getArea(){
//		return Math.PI*this.radius*this.radius;
//	}
//	public boolean equals(Circle circle){
//		return this.radius == circle.radius; 
//	}
//	public String toString() {
//		return "The circle radius is "+ this.radius + "."; 
//	}
	private final double re; // the real part
	private final double im; // the imaginary part

	// create a new object with the given real and imaginary parts
	public double Complex(double a, double b) {
		re = a;
		im = b;
	}
	
	// return a string representation of the invoking Complex object
	public String toString() {
		if (im == 0)
			return re + "";
		if (re == 0)
			return im + "i";
		if (im < 0)
			return re + " - " + (-im) + "i";
		return re + " + " + im + "i";
	}

public Complex plus(Complex b) {
	System.out.println(this.re);
	System.out.println(this.im);
	System.out.println(this);
	Complex a = this; // invoking object
	double real = a.re + b.re;
	double imag = a.im + b.im;
	return new Complex(real, imag);
}