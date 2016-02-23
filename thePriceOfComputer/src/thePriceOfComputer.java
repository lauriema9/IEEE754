/**
 * 
 */

/**
 * @author lauriema
 *
 */
public class thePriceOfComputer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double thePriceOfComputer,upgrade,newProcessor,moreRAM,newHarddrive,audioCard,videoCard;
    thePriceOfComputer = 429.99;
    newProcessor = 249.99;
    moreRAM = 42.99;
    newHarddrive = 49.99;
    audioCard = 17.99;
    videoCard = 34.99;
    upgrade = newProcessor + moreRAM + newHarddrive + audioCard + videoCard;
    double theTotalPrice = thePriceOfComputer + upgrade;
    System.out.println("The total price of a student computer is " + "$" + theTotalPrice);
    
	}

}
