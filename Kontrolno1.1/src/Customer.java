import java.util.Map;

public class Customer {
	private Shop shop;
	private double money;
	private int maxNumProducts;
	private CarShop carShop;

	public Customer(Shop shop, double money, int maxNumProducts) {
		setShop(shop);
		setMoney(money);
		setMaxNumProducts(maxNumProducts);
		setCarShop(null);
	}

	/**
	 * 
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}

	/**
	 * @param money
	 *            the money to set
	 */
	public void setMoney(double money) {
		this.money = money;
	}

	/**
	 * @return the shop
	 */
	public Shop getShop() {
		return shop;
	}

	/**
	 * @return the maxNumProducts
	 */
	public int getMaxNumProducts() {
		return maxNumProducts;
	}

	/**
	 * @return the carShop
	 */
	public CarShop getCarShop() {
		return carShop;
	}

	/**
	 * @param shop
	 *            the shop to set
	 */
	private void setShop(Shop shop) {
		if (shop != null) {
			this.shop = shop;
		} else {
			this.shop = new Shop();
		}
	}

	/**
	 * @param maxNumProducts
	 *            the maxNumProducts to set
	 */
	private void setMaxNumProducts(int maxNumProducts) {
		if (maxNumProducts >= 0) {
			this.maxNumProducts = maxNumProducts;
		} else {
			maxNumProducts = 0;
		}
	}

	/**
	 * @param carShop
	 *            the carShop to set
	 */
	private void setCarShop(CarShop carShop) {
		if (carShop != null) {
			this.carShop = carShop;
		} else {
			this.carShop = new CarShop();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [shop=" + shop.getName() + ", money=" + money
				+ ", maxNumProducts=" + maxNumProducts + ", carShop="
				+ carShop.toString() + "]";
	}

	public void addProductOtKg(Product p, double amount) {
		if (p == null) {
			System.out.println("this is null product . Error");
			return;
		}

		if (!(p instanceof ProductKg)) {
			System.out.println("Yo can add only product ot kg");
			return;
		}

		ProductKg pk = (ProductKg) p;

		if (amount <= 0) {
			System.out.println("you can add only + amont");
			return;
		}

		if (!(shop.getProductsInShop().containsKey(pk))) {
			System.out.println("There in no ptoduct " + pk.toString()
					+ "in this shop ");
			return;
		}

		int kolichestvo = 1;
		if (carShop.calculateAmount() + kolichestvo > maxNumProducts) {
			System.out.print("You have " + carShop.calculateAmount()
					+ " products in your carshop. ");
			System.out.println("You can not add more than " + maxNumProducts
					+ " products");
			return;
		}

		if (shop.getProductsInShop().get(pk) < amount) {
			System.out.println("not enought amount in this shop");
			return;
		}

		if (carShop.getProductsInCar().containsKey(pk)) {
			carShop.getProductsInCar().put(pk,
					carShop.getProductsInCar().get(pk) + amount);
			shop.getProductsInShop().put(pk,
					shop.getProductsInShop().get(pk) - amount);
		} else {
			carShop.getProductsInCar().put(pk, amount);
			shop.getProductsInShop().put(pk,
					shop.getProductsInShop().get(pk) - amount);
		}
		System.out.println("You add " + amount + "kg from 1 Product :"
				+ pk.getName());

	}

	public void addProductOtCount(Product p, int amount) {
		if (p == null) {
			System.out.println("this is null product . Error");
			return;
		}

		if (!(p instanceof ProductCount)) {
			System.out.println("Yo can add only product ot kg");
			return;
		}

		ProductCount pk = (ProductCount) p;

		if (amount <= 0) {
			System.out.println("you can add only + amont");
			return;
		}

		if (!(shop.getProductsInShop().containsKey(pk))) {
			System.out.println("There in no ptoduct " + pk.toString()
					+ "in this shop ");
			return;
		}

		if (carShop.calculateAmount() + amount > maxNumProducts) {
			System.out.print("You have " + carShop.calculateAmount()
					+ " products in your carshop. ");
			System.out.println("You can not add more than " + maxNumProducts
					+ " products");
			return;
		}

		if (shop.getProductsInShop().get(pk) < amount) {
			System.out.println("not enought amount in this shop");
			return;
		}

		if (carShop.getProductsInCar().containsKey(pk)) {
			carShop.getProductsInCar().put(pk,
					carShop.getProductsInCar().get(pk) + amount);
			shop.getProductsInShop().put(pk,
					shop.getProductsInShop().get(pk) - amount);
		} else {
			carShop.getProductsInCar().put(pk, (double) amount);
			shop.getProductsInShop().put(pk,
					shop.getProductsInShop().get(pk) - amount);
		}

		System.out.println("You add " + amount + " numbers from  Product :"
				+ pk.getName());
	}

	public void deleteKG(Product p, double amount) {
		if (p == null) {
			System.out.println("this is null product . Error");
			return;
		}

		if (!(p instanceof ProductKg)) {
			System.out.println("Yo can delete only product ot kg");
			return;
		}

		ProductKg pk = (ProductKg) p;

		if (amount <= 0) {
			System.out.println("you can delete only + amont");
			return;
		}

		if (!(carShop.getProductsInCar().containsKey(pk))) {
			System.out.println("There in no ptoduct " + pk.toString()
					+ "in this car shop ");
			return;
		}
		if (carShop.getProductsInCar().get(pk) < amount) {
			System.out.println("Not enough amont to delete");
			return;
		}

		if (carShop.getProductsInCar().get(pk) - amount == 0) {
			carShop.getProductsInCar().remove(pk);
		} else {
			carShop.getProductsInCar().put(pk,
					carShop.getProductsInCar().get(pk) - amount);
		}
		shop.getProductsInShop().put(pk,
				shop.getProductsInShop().get(pk) + amount);
		maxNumProducts += 1;
		System.out.println("You delete " + amount + "kf from product : "
				+ pk.getName());

	}

	public void deleteCount(Product p, double amount) {
		if (p == null) {
			System.out.println("this is null product . Error");
			return;
		}

		if (!(p instanceof ProductCount)) {
			System.out.println("Yo can delete only product ot kg");
			return;
		}

		ProductCount pk = (ProductCount) p;

		if (amount <= 0) {
			System.out.println("you can delete only + amont");
			return;
		}

		if (!(carShop.getProductsInCar().containsKey(pk))) {
			System.out.println("There in no ptoduct " + pk.toString()
					+ "in this car shop ");
			return;
		}
		if (carShop.getProductsInCar().get(pk) < amount) {
			System.out.println("Not enough amont to delete");
			return;
		}

		if (carShop.getProductsInCar().get(pk) - amount == 0) {
			carShop.getProductsInCar().remove(pk);
		} else {
			carShop.getProductsInCar().put(pk,
					carShop.getProductsInCar().get(pk) - amount);
		}
		shop.getProductsInShop().put(pk,
				shop.getProductsInShop().get(pk) + amount);
		maxNumProducts += shop.getProductsInShop().get(pk);
		System.out.println("You delete " + amount + "kf from product : "
				+ pk.getName());

	}

	public void pay() {
		int sum = 0;
		if (!(carShop.getProductsInCar().isEmpty())) {
			for (Map.Entry<Product, Double> e : carShop.getProductsInCar()
					.entrySet()) {
				sum += e.getKey().getPrice() * e.getValue();
			}
			if(sum > money){
				System.out.println("You have not enough money to pay. ypu have to delete something");
			}else{
				money -= sum;
				shop.setMoney(shop.getMoney() + sum);
				carShop.getProductsInCar().clear();
				System.out.println("Yoy paid. Thank You. Welkome again");
			}
		}else{
			System.out.println("Your car shop is empty.");
		}
	}

}
