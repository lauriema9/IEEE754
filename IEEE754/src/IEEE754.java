import java.util.Scanner;
public class IEEE754 {

	/**
	 * @author Likun Ma
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
		    int choice;
		    Scanner input = new Scanner(System.in);

		    do{
		        double deciNum;
		        String ieee754 = " ";
		        int bitsVal;
		        String bitsString;
		        System.out.println("Hello Welcome to the Decimal and IEEE-754 converter");
		        System.out.println("Please select the number that correspondes with the conversion you will like:"
		                + "\n 1) Convert decimal number to IEEE-754 Single Precision Floating-Point Representation"
		                + "\n 2) Convert decimal number to IEEE-754 Double Precision Floating-Point Representation"
		                + "\n 3) Convert IEEE-754 Single Precision Floating-Point Representation to decimal number"
		                + "\n 4) Convert IEEE-754 Double Precision Floating-Point Representation to decimal number "
		                + "\n 0) Exit Converter");
		        choice = input.nextInt();

		        if(choice == 1)
		        {
		            System.out.println("What decimal number will you like to convert?");
		            deciNum = input.nextDouble();
		            float f = (float)deciNum;
		            bitsVal = Float.floatToIntBits(f);
		            bitsString = Integer.toBinaryString(bitsVal);
		            System.out.println(bitsString);
		        }

		        if(choice == 2)
		        {
		            System.out.println("What decimal number will you like to convert?");
		            deciNum = input.nextDouble();
		            bitsString = Long.toString(Double.doubleToLongBits(deciNum), 2);
		            System.out.println(bitsString);
		        }

		        if(choice == 3)
		        {
		            int binIeee;
		            float deciFinal;
		            System.out.println("What IEEE-754 single precision floating-point representsation will you like to input?");
		            ieee754 = input.nextLine();
		            deciFinal = Float.intBitsToFloat(Integer.parseInt(ieee754, 2));
		             
		            System.out.println(deciFinal);
		        }
		        if(choice == 4)
		        {
		            double deciFinal;
		            System.out.println("What IEEE-754 double precision floating-point representsation will you like to input?");
		            ieee754 = input.nextLine();
		            ieee754 = ieee754.trim();
		            deciFinal = Double.longBitsToDouble(Long.parseLong(ieee754,2));
		            System.out.println(deciFinal);
		        }
		    }while (choice != 0);

		}
		
	}


