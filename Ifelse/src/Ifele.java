import java.util.Scanner;

public class Ifele {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Student ID");
		int studentID = input.nextInt();
		int number= studentID % 4 +2;
		System.out.println(number);

	}

}
