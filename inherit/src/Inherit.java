
public class Inherit {

	/**
	 * @param args
	 */

class Figure{
	void display(){
		System.out.println("Figure");
	}
}
class Rectangle extends Figure{
	final void display(){
		System.out.println("Rectangle");
	}
	}
     class Box extends Figure{
    	 void display()
    	 {
    		 System.out.println("Box");
    	 }
     }
     Inherit()
     {
    	 Figure f = new Figure();
    	 Rectangle r =new Rectangle();
    	 Box b = new Box();
    	 f.display();
    	 
    	 f.display();
    	
    	 f.display();
     }
     	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Inherit();
	}

}
