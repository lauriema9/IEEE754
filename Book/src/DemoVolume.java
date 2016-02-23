
public class DemoVolume {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] book = new Book[2];
		book[0] = new Book("Java", "Tanes", 400);
		book[1] = new Book ("Computer Science", "Liang", 800);
		
		Volume volume = new Volume("Computer Science", 2 , book);
		System.out.println(volume.toString());
		
		
		
	}

}
