import java.util.Random;
import java.util.Scanner;
public class brokenGps {

	/**
	 * @author lauriema
	 * CSC 201
	 * start with random direction
	 * calculate the time to change direction
	 * get 12 times to change direction
	 * calculate x,y when it changes direction every time
	 * set the math formula (distance) * (distance) = x^2 + y ^2
	 * get the result
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String compass[] = {"NORTH","EAST", "WEST", "SOUTH"};
		
	int x = 0, y = 0;
    double d = 0.0;
    Random random = new Random();
    int direction;
    int i = 0;
    for(i=0; i<12; i++){

        direction=random.nextInt(4);
        System.out.println(compass[direction]);
        if(direction == 0){
        	y= y+5;
        }else if(compass[1].equals("EAST")){
        	x= x+5;
        }else if(compass[2].equals("WEST")){
        	x=x-5;
        }else{
        	y= y-5;
        }
        
    }

    d=Math.sqrt((x*x)+(y*y));
      System.out.println("The total distance is " + d);
    
   
	}

}
