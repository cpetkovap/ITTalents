package kontrolno;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cabinet c1 = new Cabinet();
		Cabinet c2 = new Cabinet();

		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book("pod igoto", "ivan vazov");
		Book b4 = new Book("ulqql", "ivan vazov");
		Book b5 = new Book("pole", "delelqlq");

		
//		c1.addBook(b1);
//		c1.addBook(b2);
//		c1.addBook(b3);
//		c1.addBook(b3);
//		c2.addBook(b3);
//		c2.addBook(b4);
//		c2.addBook(b5);
		
		Set<Cabinet> s = new HashSet();
		s.add(c1);
		s.add(c2);
		
		Library l = new Library("l1", s);
		
		Slujitel slu = new Slujitel("gg", l);
		slu.addBook(b1, c1);
		slu.addBook(b2, c1);
		slu.addBook(b3, c1);
		slu.addBook(b3, c1);
		slu.addBook(b3, c2);
		slu.addBook(b4, c2);
		slu.addBook(b5, c2);
		System.out.println(l);
		
		Person p = new Person("ivan" , l);
		Person p2 = new Person("petko" , l);
		
		//System.out.println(b4);
		Book b = p.searchBook(b4);
		//System.out.println(b);
		//System.out.println(c1);
		//System.out.println(c2);
		//System.out.println();
		//System.out.println(l.toString());
		//System.out.println(p.getReadingBook());
		p.getBook(b3);
		
		//System.out.println(l.toString());
		//System.out.println(p.getReadingBook());
		p2.getBook(b3);
		System.out.println(l.toString());
		System.out.println(p.getReadingBook());
		p.returnBook(b3);
		System.out.println(l.toString());
		System.out.println(p.getReadingBook());

		

	}

}
