import java.util.Scanner;

public class CalculateANum {

	/**
	 * CSC 201 Unit one programming problem one
	 * @author LIKUN MA
	 * Professor Tanes
	 * 
	 * input student ID number
	 * calculate student ID number is divided by 4 increment by 2
	 * get the number is chapter number
	 * get question number 
	 * out put the question number
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your studentID ");
		int studentID = input.nextInt();
		int chaptNum = studentID % 4 + 2;
		System.out.println("Your chapter number is " + chaptNum);
		int questionNum = 0;
		if (chaptNum == 2){
			questionNum = studentID % 26 + 1;
		} else if (chaptNum == 3) {
			questionNum = studentID % 34 +1;
		} else if (chaptNum == 4) {
			questionNum = studentID % 46 +1;
		} else {
			questionNum = studentID % 38 +1;
		}
		System.out.println("Please solve programming exercise number " + questionNum + " from the chapter " + chaptNum);
		
	}
 
}
