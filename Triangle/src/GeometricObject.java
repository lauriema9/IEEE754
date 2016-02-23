import java.util.Scanner;
public class GeometricObject {

	/**
	 * @param args
	 */
	private String color = "";
	private boolean filled;
	public GeometricObject(){

	}
		/**construct a geometric object with specified color
		 * and filled value
		 */
	public GeometricObject(String color, boolean filled){
    	this.color=color;
    	this.filled=filled;
    }
    /**Return color*/
    public String getColor(){
    	return color;
    }/**Return filled*/
    public boolean isFilled(){
    	return filled;
    	
    }public String toString(){
    	return "color: " + this.color + " and filled " + this.filled;
    }
    
	}

	
