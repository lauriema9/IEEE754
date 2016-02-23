
public class Triangle  extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(){
		side1=1.0;
		side2=1.0;
		side3=1.0;
	}
	public Triangle(double side1,double side2, double side3){
			this.side1=side1;
			this.side2=side2;
			this.side3=side3;

			
		}
	public double getArea(){
		double h = Math.sqrt(Math.pow(side1,2)-Math.pow((side2/2),2));
	    double area = (h*side2)/2;
		return area;
		
	}
	public double gerPerimeter(){
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
}
