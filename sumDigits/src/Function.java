import java.util.Scanner;
public class Function {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter a number : ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
        System.out.println(f(x));
 }
	
	public static int f(int x) {
		return (x + 1);
	}

}
