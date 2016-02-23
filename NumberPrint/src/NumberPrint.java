import java.util.Scanner;
public class NumberPrint {
     
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     int x = input.nextInt();
     int y = input.nextInt();
     int z = x + y;
      if (x > 2){
    	  if (y >2){
    		  z = x + y;
    		  System.out.println("z is " + z);
    		  
    	  }
      }
      else
    	  System.out.println("x is " + x);
      
	}

}
