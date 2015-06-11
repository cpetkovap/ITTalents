import java.util.HashMap;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product[] products =new Product[6];
		products[0] = new ProductCount("chips", 1.2);
		products[1] = new ProductCount("vafla", 1);
		products[2] = new ProductCount("kroasan", 2.1);
		products[3] = new ProductKg("Riba", 3.3);
		products[4] = new ProductKg("Sirene", 9.5);
		products[5] = new ProductKg("maslini", 32.13);
		//System.out.println(products[0]);
		
 		
		Shop s = new Shop("shop", "asa", 10);
		//System.out.println(s.toString());
		s.addInShop(products[0], 1);
		s.addInShop(products[1], 2);
		s.addInShop(products[2], 13);
		s.addInShop(products[3], 7.7);
		s.addInShop(products[4], 5);
		s.addInShop(products[5], 6);
		//System.out.println(s);
		
		Customer c = new Customer(s, 10, 12);
		
		//System.out.println(c);
		System.out.println(c.getCarShop());
		System.out.println(s.getProductsInShop());
		c.addProductOtKg(products[3], 5);			
		c.addProductOtKg(products[3], 1);
		//System.out.println(c.getCarShop());
		c.deleteKG(products[3], 6);
		c.addProductOtCount(products[1], 1);
		c.addProductOtCount(products[0], 1);
		c.deleteCount(products[0], 1);
		c.addProductOtCount(products[2], 7);
		
		System.out.println(c.getCarShop());
		System.out.println(s.getProductsInShop());
		
		
		System.out.println();
		System.out.println(s.getMoney());
		System.out.println(c.getMoney());
		c.pay();
		System.out.println(s.getMoney());
		System.out.println(c.getMoney());
		System.out.println(c.getCarShop());
		

	}

}
