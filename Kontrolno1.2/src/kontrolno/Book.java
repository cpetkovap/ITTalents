package kontrolno;

public class Book {
	private final String name;
	private final String autor;
	private boolean available;
	private Cabinet cabinet;
	
	
	
	public Book(String name, String autor) {
		if(name != null){
			this.name = name;
		}else{
			this.name = "default book name";
		}
		if(autor != null){
			this.autor = autor;
		}else{
			this.autor = "default autor name";
		}
		setAvailable(false);
		setCabinet(null);
	}
	
	Book(){
		this(null, null);
	}
	/**
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}
	/**
	 * @param cabinet the cabinet to set
	 */
	public void setCabinet(Cabinet cabinet) {
		if(cabinet != null){
			this.cabinet = cabinet;
		}else{
			this.cabinet = null;
		}
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @return the cabinet
	 */
	public Cabinet getCabinet() {
		return cabinet;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		
		this.available = available;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if(cabinet != null && !cabinet.getBooks().isEmpty()){
			return "Book [name=" + name + ", autor=" + autor + ", available="
					+ available + ", cabinet=" + cabinet.getNum() + "]";
		}else{
			return "Book [name=" + name + ", autor=" + autor + ", available="
					+ available + "]";
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.name.equals(((Book)obj).getName()) && this.autor.equals(((Book)obj).getAutor());
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode() + this.autor.hashCode();
	}
	

}
