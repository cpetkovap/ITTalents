package kontrolno;

public class Slujitel {
	private final String name;
	private Library l;
	
	
	
	
	public Slujitel(String name, Library l) {
		if(name != null){
			this.name = name;
		}else{
			this.name = "iva";
		}
		setL(l);
	}
	/**
	 * @return the l
	 */
	public Library getL() {
		return l;
	}
	/**
	 * @param l the l to set
	 */
	private void setL(Library l) {
		if(l != null){
			this.l = l;
		}else{
			this.l = new Library();
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
		if(l != null){
			return "Slujitel [name=" + name + ", l=" + l.toString() + "]";
		}else{
			return "Slujitel [name=" + name + "]";
		}
	}
	
	
	public void addBook(Book p, Cabinet c){
		if(p == null){
			System.out.println("null book");
			return;
		}
		if(c == null){
			System.out.println("null cabinet");
			return;
		}
		if(p.getCabinet() != null){
			System.out.println("this book is already set in another cabinet");
			return;
		}
		if(!l.getCabinets().contains(c)){
			System.out.println("no these cabinet");
		}
		p.setCabinet(c);
		p.setAvailable(true);
		c.getBooks().add(p);
		System.out.println("Yoy add book " + p);
	}
	

}
