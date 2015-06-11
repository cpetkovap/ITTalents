 
public class ProductCount extends Product{

	private final boolean isKg;

	public ProductCount(String name, double price) {
		super(name, price);
		isKg = false;
	}

	/**
	 * @return the isKg
	 */
	public boolean isKg() {
		return isKg;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductCount ["+ super.toString() +" isKg=" + isKg + "]";
	}
}
