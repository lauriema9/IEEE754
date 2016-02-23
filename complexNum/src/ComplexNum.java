import java.util.Scanner;

public class ComplexNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		float a1, a2, b1, b2;
		double z1, z2;
		int i;
	
		// get the real part and the imaginary part from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the real part a1 ");
		a1 = input.nextFloat();
		System.out.println("Enter the imaginary part b1 ");
		b1 = input.nextFloat();
		System.out.println("Enter the real part a2 ");
		a2 = input.nextFloat();
		System.out.println("Enter the imaginary part b2 ");
		b2 = input.nextFloat();
		double a = a1+a2;
		double b = b1+b2;
		double c = a1-a2;
		double d = b1-b2;
		double e = a1*a2;
		double f = b1*b2;
		double g = a1*b2;
		double h = b1*a2;
		
			String sign="+";
        //calculate the operator between z1 and z2
    //    double addition = a + i*b;
           System.out.println("the addition of z1 and z2 is " + a +" + "+b+"i");
       // double subtraction = c +  i*d;
           if(d<0) {
        	   sign = "";
           } if((e-f)<0){
        	   sign = "";
        	      }else {
        	    	  sign = "+";
        	      }
           if((h-g)<0){
        	   sign = "";
           }else{
        	   sign = "+";
           }
           
            System.out.println("the subtraction of z1 and z2 is " + c + sign + d +"i");
      //  double multiplication =  (e-f) + i*(g + h);
             System.out.println("the multiplication of z1 and z2 is " + sign + (e-f) + sign + (g+h) + "i");
        //       double division = (e +f)/(a2*a2 + b2*b2) + i*(h-g)/(a2*a2 + b2*b2);
               System.out.println("the division of z1 and z2 is " + sign + (e+f)/(a2*a2 + b2*b2)+sign + (h-g)/(a2*a2 + b2*b2)+"i");     
        
	}
}
