
public class PayCalculatorDrive {

	private static final double PayCalculatorDrive = 0.0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayCalculator paycalculator1 = new RegularPay(8.0);
		PayCalculator paycalculator2 = new HazardPay(8.0);
	
		System.out.println(paycalculator1.computePay(10));
		System.out.println(paycalculator2.computePay(10));
		
		
	}

}
