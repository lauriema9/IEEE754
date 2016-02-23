
public abstract class PayCalculator {
	protected double payRate;
	
	

	/**
	 * @param args
	 */
	public double computePay(int hours) {
		double computePay = payRate * hours;
        return computePay;
	}

}
