package kontrolno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person {
	private final String name;
	private Set<Book> readingBook;
	private Library library;
	
	
	public Person(String name, Library library) {
		if(name != null){
			this.name = name;
		}else{
			this.name = "default person name";
		}
		setReadingBook(null);
		setLibrary(library);
	}
	
	public Person() {
		this(null, null);
	}
	
	public void setLibrary(Library library) {
		if(library != null){
			this.library = library;
		}else{
			this.library = new Library();
		}
		
	}

	
	/**
	 * @return the library
	 */
	public Library getLibrary() {
		return library;
	}

	/**
	 * @return the readingBook
	 */
	public Set<Book> getReadingBook() {
		return readingBook;
	}
	/**
	 * @param readingBook the readingBook to set
	 */
	private void setReadingBook(Set<Book> readingBook) {
		if(readingBook != null){
			this.readingBook = readingBook;
		}else{
			this.readingBook = new HashSet<Book>();
		}
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", readingBook=" + readingBook.toString()
				+ ", library=" + library.toString() + "]";
	}

	public Book searchBook(Book b){
		if(b == null){
			System.out.println("null book");
			return null;
		}
		Book result = null;
		if(readingBook.contains(b)){
			System.out.println("You already read this book");
			return null;
		}
		for(Iterator<Cabinet> i = library.getCabinets().iterator(); i.hasNext();){
			Cabinet c = i.next();
			for(Iterator<Book> k = c.getBooks().iterator(); k.hasNext();){
				Book book = k.next();
				if(book.equals(b)){
					result = book;
					break;
				}
			}
		}
		
		
		return result;
	}
	
	public void getBook(Book b){
		if(b == null){
			System.out.println("null book");
			return;
		}
		Book containsBook = searchBook(b);
		if(containsBook == null){
			System.out.println("this book is not contains in this lybrary");
			return;
		}
		if(readingBook.contains(containsBook)){
			System.out.println("You already read this book");
			return;
		}
		if(!containsBook.isAvailable()){
			System.out.println("this book is not available");
			return;
		}
		System.out.println("you get book " + b);
		readingBook.add(b);
		b.setAvailable(false);
	}
	
	public void returnBook(Book b){
		if(b == null){
			System.out.println("null book");
			return;
		}
		
		Book returnBook = null;;
		for(Iterator<Book> i = readingBook.iterator(); i.hasNext(); ){
			Book book = i.next();
			if(b.equals(book)){
				returnBook = book;
				//System.out.println("tyyyyy" + returnBook);
				break;
			}
		}
		if(returnBook == null){
			System.out.println("you are not get this book");
			return;
		}
		System.out.println("Thank you for returning book " + returnBook.toString());
		returnBook.setAvailable(true);
		readingBook.remove(returnBook);
		
	}

}
