
public class Rectangle {
	/**Main method*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a rectangle with width and height
			Rectangle rectangle =new Rectangle();			
			System.out.println("The width of rectangle is " + rectangle.width);
			System.out.println("The height of rectangle is " + rectangle.height);
			System.out.println("The area of rectangle is " + rectangle.getArea());
			System.out.println("The perimeter of rectangle is " +rectangle.getPerimeter());			
	}
		double width;
		double height;
		/**Construct a rectangle with width 1*/
		Rectangle(){
		width =1;
		height=1;
	}	
		/**Construct a rectangle with a specified width and height*/
		Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height=newHeight;	
	}
		/**Return the area of this rectangle*/
		double getArea(){
			return width*height;
		}
		/**return the perimeter of this rectangle*/
		double getPerimeter(){
			return 2*(width + height);
			}
		/**Set a new radius for this rectangle*/
		void setWidth(double newWidth){
			width = newWidth;
		 }
		void setHeight(double newHeight){
			height = newHeight;
		}
}     
