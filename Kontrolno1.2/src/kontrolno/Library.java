package kontrolno;

import java.util.HashSet;
import java.util.Set;

public class Library {
	private final String name;
	private Set<Cabinet> cabinets = new HashSet<Cabinet>();
	
	public Library(String name){
		if(name != null){
			this.name = name;
		}else{
			this.name = "default library name";
		}
		setCabinets(null);
	}
	
	
	public Library(String name, Set<Cabinet> cabinets) {
		this(name);
		setCabinets(cabinets);
	}
	
	public Library() {
		this(null, null);
	}
	/**
	 * @return the cabinets
	 */
	public Set<Cabinet> getCabinets() {
		return cabinets;
	}
	/**
	 * @param cabinets the cabinets to set
	 */
	private void setCabinets(Set<Cabinet> cabinets) {
		if(cabinets != null){
			this.cabinets = cabinets;
		}else{
			this.cabinets = new HashSet<Cabinet>();
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
		return "Library [name=" + name + ", cabinets=" + cabinets.toString() + "]";
	}
	
	

}
