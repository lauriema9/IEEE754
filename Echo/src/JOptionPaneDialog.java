/**
 * @Pragram echo-JOptionPaneDialog
 * Author:LIKUN MA
 * Date: 2/13/2015
 * Email: ml20130@email.vccs.edu
 */


		import javax.swing.JOptionPane;
		import java.util.Scanner;
		public class JOptionPaneDialog {
		     public static void main(String[] args){
		    	 final double PI = 3.1415926;
		    	 byte x=120; //-128 to 127
		    	 
		    	 short y=10000;  //-32,768 to 32,767
		    	 
		    	 int z=1000000;  //-2,147,483,648 to 2,147,483,647
		    	 
		    	 long u=1000000000;//-9,223,372,036,8547,75,808 to 9,223,372,036,854,775,807
		    	    	 
		    	 float v;
		    	 v = 2.0f;    
		    	 double m=600.50;
		    	 double num1,num2,sum,diff,multiply,quotient,remainder;
		    	 char letter = 'M';
		    	 char letter1;
		    	 
		    	 boolean status = false;
		    	 boolean status1;
		    	
		    	 Scanner keyboard = new Scanner(System.in);
		    	 System.out.println("Enter first number");
		    	 num1 = keyboard.nextDouble();
		    	 System.out.println("Enter second number");
		    	 num2 = keyboard.nextDouble();
		    	 sum = (int)(num1+num2);
		    	 quotient = (double)(num1/num2);
		    	 multiply = (double)(num1*num2);
		    	 diff = (double)(num1-num2);
		    	 remainder = (double)(num1%num2);
		    	 letter1 = (char) keyboard.next().charAt(0);
		    	 status1 = keyboard.nextBoolean();		    	
		    	 JOptionPane.showMessageDialog(null,"the sum is \"" + sum + "\"" 
		    	        + "\n" + "the quotient is \"" + quotient + "\"" 
	    			+ "\n" + "the product is \"" + multiply + "\"" 
		    	        + "\n" + "the difference is \"" + diff + "\""
		    	        + "\n" + "the remainder is \"" + remainder + "\""
		    	        + "\n" + "the letter is \"" + letter1
		    	        + "\n" + "the status is \"" + status1);
		    	 
		    	
		    	 
		    	 
		    	
	}
}
