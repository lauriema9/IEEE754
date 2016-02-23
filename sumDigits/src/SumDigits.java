import  java.util.Scanner;
public class SumDigits {


	
	public int sumDigits(long n){
	  int sum=0;
	
	 while (!(n==0)){
		  sum = sum + (int)(n%10);
		  
		  n = n/10;
	  }
	  		  
	  return sum;		
	}
}