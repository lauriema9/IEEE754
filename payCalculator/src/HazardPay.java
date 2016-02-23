
public class HazardPay extends PayCalculator{
    public HazardPay(double payRate){
   	 super.payRate = payRate;
    }
	public double computePay(int hours){
		return super.computePay(hours)*1.5;
	}
 
	

}
