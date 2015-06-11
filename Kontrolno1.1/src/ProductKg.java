
public class ProductKg extends Product {
	private final boolean isKg;

	public ProductKg(String name, double price) {
		super(name, price);
		isKg = true;
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
		return "ProductKg ["+ super.toString() +" isKg=" + isKg + "]";
	}
	
	

	
	

}
