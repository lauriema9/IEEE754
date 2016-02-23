import java.util.Scanner;


public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		System.out.println("please enter a number : ");  
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		SumDigits sumDigits = new SumDigits();
		System.out.println(sumDigits.sumDigits(n));	
	}

}
