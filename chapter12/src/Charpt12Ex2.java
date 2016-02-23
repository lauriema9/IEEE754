import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;

public class Charpt12Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InputMismatchException{
		// TODO Auto-generated method stub
		 int i1,i2;
		 i1=0;
		 i2 =0;
		 boolean done = false;

	     do {
		     try {
			     Scanner input = new Scanner(System.in);
		    	 System.out.println("Enter the first integer ");
		    	 i1 = input.nextInt();
		    	 System.out.println("Enter the Second integer ");
		    	 i2 = input.nextInt();
		    	 done = true;
		    	 input.close();
		     }
		     catch (InputMismatchException e){
		    	 System.out.println("You did not put the correct format \n ");
		    	 done = false;	    	 
		     }
	     }
	     while (done == false);
         System.out.println("sum of integers is " + (i1 + i2));
	}

}
