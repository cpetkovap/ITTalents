
public abstract class Product {
	private String name;
	private double price;
	
	public Product() {
		setName(null);
		setPrice(0);
	}
	
	
	public Product(String name, double price) {
		setName(name);
		setPrice(price);
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param name the name to set
	 */
	protected void setName(String name) {
		if(name != null){
			this.name = name;
		}else{
			this.name = "default product name";
		}
	}
	/**
	 * @param price the price to set
	 */
	protected void setPrice(double price) {
		if(price > 0){
			this.price = price;
		}else{
			this.price = 1;
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "name=" + name + ", price=" + price ;
	}
	
	
	

}
