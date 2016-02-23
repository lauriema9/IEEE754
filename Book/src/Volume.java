
public class Volume {

	/**
	 * @param args
	 */
	private String volumeName;
	private int numberOfBooks;
	private Book[] book;
	
	public Volume(String volumeName, int numberOfBooks, Book[] book) {
		this.book = book;
		//
	}

	public Book[] getBookArray() {
		return this.book;
	}
	
	public String toString() {
		String list="";
		for(int i=0; i<book.length; i++) {
			list +=book[i] + "\n";
		}
		return "Volume [ VolumeName = " + volumeName + " Number of Books " + numberOfBooks + " Book[] = " + list + "]";
	}
}
