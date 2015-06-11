package kontrolno;

import java.util.HashSet;

public class Cabinet {
	private static int number = 0;
	private final String num;
	private HashSet<Book> books;
	
	
	public Cabinet(HashSet<Book> books) {
				
		setBooks(books);
		this.num = "Num " + (++number);
	}
	
	public Cabinet(){
		this(null);
	}
	/**
	 * @return the books
	 */
	public HashSet<Book> getBooks() {
		return books;
	}
	/**
	 * @param books the books to set
	 */
	private void setBooks(HashSet<Book> books) {
		if(books != null){
			this.books = books;
		}else{
			this.books = new HashSet();
		}
	}
	/**
	 * @return the number
	 */
	public String getNum() {
		return num;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if(books != null && !books.isEmpty()){
			return "Cabinet [num=" + num + ", books=" + books.toString() + "]";
		}else{
			return "Cabinet [num=" + num + "]";
		}
	}
	
//	public void addBook(Book p){
//		if(p == null){
//			System.out.println("null book");
//			return;
//		}
//		if(p.getCabinet() != null){
//			System.out.println("this book is already set in another cabinet");
//			return;
//		}
//		p.setCabinet(this);
//		p.setAvailable(true);
//		books.add(p);
//		System.out.println("Yoy add book " + p);
//	}
	

}
