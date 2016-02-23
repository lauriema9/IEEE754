
public class Room {
	/**
	 * define a color of the wall 
	 */
	
	private String wall;
	private String floor;
	private int windows;
	
	/**
	 * Initialize the wall color according to the default value ("")
	 */
	public Room() {
		wall="";
		floor="";
		windows=0;
	}
	
	/**
	 * Initialize the wall color according to the parameter
	 * @param color a color of the wall
	 */
	public Room(String color) {
		this.wall = color;
		this.floor ="";
		this.windows=0;
	}
	
	/**
	 * Initialize the room with number of windows
	 * @param noOfWindows the number of windows (data type is integer)
	 */
	public Room(int noOfWindows) {
		this.windows = noOfWindows;
		this.floor="";
		this.wall="";
	}
	public Room(String color,String floor, int noOfWindows){
		this.windows = noOfWindows;
		this.floor=floor;
		this.wall=color;
	}
	
	/**
	 * Get the floor type
	 * @return the floor type
	 */
	public String getFloor() {
		return floor;
	}

	/**
	 * Set the floor type
	 * @param floor floor type
	 */
	public void setFloor(String floor) {
		this.floor = floor;
	}

	/**
	 * get the number of windows
	 * @return number of windows
	 */
	public int getWindows() {
		return windows;
	}

	/**
	 * 
	 * @param windows
	 */
	public void setWindows(int windows) {
		this.windows = windows;
	}

	/**
	 * 
	 * @param color
	 */
	public void setWall(String color) {
		this.wall = color;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getWall() {
		return this.wall;
	}

	/**
	 * 
	 */

	public String toString() {
		return "Room [wall=" + wall + " Floor = " + floor + " Windows = " + windows+"]";
		
		
	}
	
	
	
	
}