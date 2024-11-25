import java.util.HashMap;
import java.util.Map;

public class BookCounter{
	
	public static void main(String[] args) {
		Book[] library=new Book[] {
				new Book("The Lord of the Rings","J.R.R Tolkier",2),new Book("Pride and Prejudice","Jane Austin",1)
		};
		Map<String,Integer> bookCounts=countBooks(library);
		for(Map.Entry<String,Integer> entry:bookCounts.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

	
	
	public static Map<String,Integer> countBooks(Book[] library){
		Map<String,Integer> bookCounts=new HashMap<>();
		
		for(Book book:library) {
			String title=book.getTitle();
			int count=bookCounts.getOrDefault(title, 0);
			bookCounts.put(title, count+book.getCount());
		}
		return bookCounts;
	}
	

}
class Book{
	private String title;
	private String author;
	private int count;
	
	public Book(String title, String author, int count) {
		this.title = title;
		this.author = author;
		this.count = count;
	}

	public String getTitle() {
		return title;
	}

	public int getCount() {
		return count;
	}	
}
