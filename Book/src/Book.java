
public class Book {

	/**
	 * @param args
	 */
	private String title;
	private String author;
	private int numberOfPages;
	
/**create a constructor */
	public Book(String title, String author, int numberOfPages) {
		this.title=title;
		this.author=author;
		this.numberOfPages=numberOfPages;
		
		
	}

	public String toString() {
		return "Book [title = " + title + " author " + author + " numberOfPages "+ numberOfPages + " ]";
		
		
	}
	
}
