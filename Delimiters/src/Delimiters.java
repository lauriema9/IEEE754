	/**
	 * @param args
	 * Author: LIKUN MA
	 * Date: 2/2/2015
	 * Email: ml20130@email.vccs.edu
	 */

	 import java.util.Scanner;
  public class Delimiters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner keyboard1 = new Scanner(System.in);
      
      
      keyboard1.useDelimiter(",");
     
    //use comma as delimiter
      
      System.out.println("write down 10 words");
     int n1 = keyboard1.nextInt();//write down number 1
     int n2 = keyboard1.nextInt();//write down number 2
     int n3 = keyboard1.nextInt();//write down number 3
     int n4 = keyboard1.nextInt();//write down number 4
     int n5 = keyboard1.nextInt();//write down number 5
     int n6 = keyboard1.nextInt();//write down number 6
     int n7 = keyboard1.nextInt();//write down number 7
     int n8 = keyboard1.nextInt();//write down number 8
     int n9 = keyboard1.nextInt();//write down number 9
     int n10 = keyboard1.nextInt();//write down number 10
     
     System.out.println("The ten numbers are " + n1 + "\t" + n2 + "\t" + n3 + "\t" + n4 + "\t" + n5 + 
    		 "\t" + n6 + "\t" + n7 + "\t" + n8 + "\t" + n9 + "\t" + n10);
     //escape sequence
      
      System.out.println("The sum of those ten numbers is ");
      System.out.println(n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10);
      //sum operator
      System.out.println("The average number of those ten numbers is ");
      System.out.println((n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10) / (10));
	//divide operator
	} 

}
