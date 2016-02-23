
public class DayDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Day day = new Day("Sunday");
          System.out.println("Current Day: " + day);
          System.out.println("Next Day: " + day.nextDay());
          System.out.println("Previous Day: " + day.previousDay());
          System.out.println("Next 4 Days: " + day.calculateDay(4));
          
	}

}
