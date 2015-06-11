import java.util.HashMap;
import java.util.Map;


public class CarShop {
	private HashMap<Product, Double> productsInCar;
	
	public CarShop() {
		setProductsInCar(productsInCar);
	}

	/**
	 * @return the productsInCar
	 */
	public HashMap<Product, Double> getProductsInCar() {
		return productsInCar;
	}

	/**
	 * @param productsInCar the productsInCar to set
	 */
	private void setProductsInCar(HashMap<Product, Double> productsInCar) {
		if(productsInCar != null){
			this.productsInCar = productsInCar;
		}else{
			this.productsInCar = new HashMap<Product, Double>();
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CarShop [productsInCar=" + productsInCar.toString() + "]";
	}
	
	public int calculateAmount(){
		int result = 0;
		
		for(Product e : productsInCar.keySet()){
			//Product s = e.getKey();
			if(e instanceof ProductKg){
				//System.out.println(e +  ": "+ productsInCar.get(e));
				result += 1;
			}else if(e instanceof ProductCount){
				//System.out.println(e +  ": "+ productsInCar.get(e));
				result +=  productsInCar.get(e);
			}
		}
		//System.out.println(result);
		return result;
	}
	

}
