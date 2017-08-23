package shopTask;

public class ShopDemo {

	public static void main(String[] args) {
		
		Shop fantastiko = new Shop("Fantastiko", "Ovcha Kupel", 1000);
		
		ProductOfKg meat = new ProductOfKg("Meat", 5.80, 10);
		ProductOfKg cheese = new ProductOfKg("Cheese", 4.30, 15.6);
		ProductOfKg fish = new ProductOfKg("Fish", 9.20, 7);
		
		ProductOfQ beer = new ProductOfQ("Beer", 2.20, 100);
		ProductOfQ chocolate = new ProductOfQ("Chocolate", 1.95, 90);
		ProductOfQ iceCream = new ProductOfQ("Ice cream", 3.20, 300);
		
		fantastiko.addProductsKg(meat);
		fantastiko.addProductsKg(cheese);
		fantastiko.addProductsKg(fish);
		fantastiko.addProductsQ(beer);
		fantastiko.addProductsQ(chocolate);
		fantastiko.addProductsQ(iceCream);
		
		Buyer nikol = new Buyer(fantastiko, 69, 10);
		Buyer boris = new Buyer(fantastiko, 100, 20);
		Buyer raya = new Buyer(fantastiko, 169, 50);
		
		fantastiko.showInfoForShop();
		
		nikol.addProductsOfKg(fish, 2.3);
		nikol.addProductsOfQ(iceCream, 10);
		nikol.removeProductsOfQ(iceCream, 5);
		nikol.payInCash();
		
		boris.addProductsOfKg(meat, 3.2);
		boris.addProductsOfQ(beer, 3);
		boris.payInCash();
		
		boris.addProductsOfQ(chocolate, 5);
		boris.payInCash();
		
		raya.addProductsOfKg(cheese, 2.9);
		raya.addProductsOfQ(iceCream, 9);
		raya.addProductsOfQ(beer, 10);
		raya.payInCash();	
	}
}
