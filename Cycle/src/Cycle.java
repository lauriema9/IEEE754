
public class Cycle {
	/** state objects as properties*/
	private int numberOfWheels;
	private int weight;
	
	
	
	/**construct two parameters*/
	public Cycle(int numberOfWheels, int weight){
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
		numberOfWheels =100;
		weight =1000;
	}
		
	public String toString(){
		return "Cycle [ numberOfWheels =" + numberOfWheels + "; weight = " + weight+ "bl ]"; 
		
	}


}
