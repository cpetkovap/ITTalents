import java.util.HashMap;


public class Shop {
	private final String name;
	private final String address;
	private double money;
	private HashMap<Product, Double> productsInShop;
	
	
	
	public Shop(String name, String address, double money) {
		if(name != null){
			this.name = name;
		}else{
			this.name = "default shop name";
		}
		if(address != null){
			this.address = address;
		}else{
			this.address = "default shop address";
		}
		setMoney(money);
		setProductsInShop(null);
	}
	
	public Shop(){
		this("default shop name", "default shop adres", 10);
	}
	/**
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}
	/**
	 * @param money the money to set
	 */
	public void setMoney(double money) {
		if(money >= 0){
			this.money = money;
		}else{
			this.money = 0;
		}
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @return the productsInShop
	 */
	public HashMap<Product, Double> getProductsInShop() {
		return productsInShop;
	}
	/**
	 * @param productsInShop the productsInShop to set
	 */
	private void setProductsInShop(HashMap<Product, Double> productsInShop) {
		if(productsInShop !=  null){
			this.productsInShop = productsInShop;
		}else{
			//System.out.println("dd");
			this.productsInShop = new HashMap();
			
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		if(!(productsInShop.isEmpty())){
			return "Shop [name=" + name + ", address=" + address + ", money="
					+ money + ", productsInShop=" + productsInShop.toString() + "]";
		}else{
			return "Shop [name=" + name + ", address=" + address + ", money="
					+ money + ", productsInShop= no products in shop ]";
		}
	}
	
	public void addInShop(Product p, double amount){
		if(p instanceof ProductKg){
			productsInShop.put(p, amount);
		}else if( p instanceof ProductCount){
			int am = (int)amount;
			System.out.print("You can add only int amount");			
			
			System.out.println("You add " + am);
			productsInShop.put(p, (double)am);
		}
	}
	
	
	

}
