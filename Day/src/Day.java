/**
 * 
 * @author Likun Ma
 * Assignment6
 * Target: set day
 * Date:dApril 29, 2015
 * email: ml20130@email.vccs.edu
 *
 */
public class Day {
    private String day;
    private String [] days ={"Monday", "Tuesday", "Wednesday", "Thuesday", "Friday", "Saturday", "Sunday"}; 
	
    /**
     * Intialize to Monday
     */
    public void Day(){
    	this.day = "Mon";
    }
    
    /**
     * Initialize day of the week
     * @param day day of the week
     */
    public Day(String day){
		super();
		this.day = day;
	}

     /**
      * Return current day
      * @return get the current day
      */
	public String getDay() {
		return day;
	}

    /**
     * 
     * @param day set day
     */
	public void setDay(String day) {
		this.day = day;
	}
	
	/**
	 * 
	 * @param numberofDays
	 * @return return calculate day
	 */
	public String calculateDay(int numberofDays){	
        String message = "";
        int dayIndex = getDayIndex(this.day);
		if(dayIndex!=-1){
			//%7 to get back to begin index of days array to prevent
			//index out of bounds errors
			message = days[(dayIndex+numberofDays)%7];
		} else {
			message = "Invalid Day!";
		}
		return message;
	}
	/**
	 * 
	 * @return return previous day
	 */
	 public String previousDay(){
		 return calculateDay(-1);
	 }
	 
	 /**
	  * 
	  * @return return next day
	  */
	 public String nextDay(){
		 return calculateDay(1);
	 }
     
	 /**
	  * 
	  * @param day
	  * @return return the day
	  */
     private int getDayIndex(String day){
    	 for(int i=0; i<days.length; i++){
    		 if (days[i]==this.day){
    			 return i%7;
    		 }
    	 }
    	 return -1;
     }
    /**
     * 
     */
	@Override
	public String toString() {
		return "Day [day=" + day + "]";
	}



	

}
