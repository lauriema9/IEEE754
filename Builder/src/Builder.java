import java.util.Scanner;
public class Builder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     
     // prompt the user to enter a string
     System.out.println("Enter Java Is Fun!");
     String s = input.nextLine(); 
     
     StringBuilder stringBuilder = new StringBuilder(s);
     System.out.println(stringBuilder.capacity());
     
  
    		 stringBuilder.append("I Love it!");
    		 System.out.println("Yes or No?");
    	      String a = input.nextLine();
    	      stringBuilder.insert(12, a);
    	     
    	 
     System.out.println(stringBuilder);
     }
	
    	
}
