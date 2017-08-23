package shopTask;

import java.util.ArrayList;
import java.util.List;

public class Buyer {
	
	private Shop shopIn;
	private double money;
	private int maxProducts;
	private static int num = 1;
	private int id;
	private double moneyToPay;
	private List<Product> shoppingCart = new ArrayList<Product>();
	
	public Buyer(Shop shopIn, double money, int maxProducts) {
		this.setShopIn(shopIn);
		this.setMoney(money);
		this.setMaxProducts(maxProducts);
		this.id = num;
		num++;
	}
	
	public Shop getShopIn() {
		return shopIn;
	}
	
	public void setShopIn(Shop shopIn) {
		if (shopIn != null) {
			this.shopIn = shopIn;
		} else {
			System.out.println("Enter a valid shop!");
		}	
	}
	
	public double getMoney() {
		return money;
	}
	
	public void setMoney(double money) {
		if (money >= 0) {
			this.money = money;
		} else {
			System.out.println("Enter a valid money!");
		}	
	}
	
	public int getMaxProducts() {
		return maxProducts;
	}
	
	public void setMaxProducts(int maxProducts) {
		if (maxProducts > 0) {
			this.maxProducts = maxProducts;
		} else {
			System.out.println("Enter a valid num!");
		}
	}
	
	public double getMoneyToPay() {
		return moneyToPay;
	}

	public void setMoneyToPay(double moneyToPay) {
		if (moneyToPay >= 0) {
			this.moneyToPay = moneyToPay;
		} else {
			System.out.println("Enter valid money!");
		}	
	}

	public void addProductsOfKg(ProductOfKg productKg, double quantity) {
		if (maxProducts > 0 && productKg.getQuantity() >= quantity) {
			ProductOfKg product = new ProductOfKg(productKg.getNameOfProduct(), productKg.getPrice(), quantity);
			shoppingCart.add(product);
			System.out.println("Buyer " + this.id + " add " + quantity + " kg of " + product.getNameOfProduct() + " to his cart.");
			productKg.setQuantity(productKg.getQuantity() - quantity);
			System.out.println("In the shop " + this.shopIn.getNameOfShop() + " lefts " + productKg.getQuantity() + "kg " + productKg.getNameOfProduct());
			moneyToPay += product.getPrice() * quantity;
			System.out.println("All products's price in the shopping cart at this moment is: " + this.moneyToPay);
			System.out.println("Buyer " + this.id + " cash is: " + this.money);
			maxProducts--;
		} else {
			System.out.println("It has no free places or no enought quantity to add the product!");
		}
		System.out.println("--------------------------");
	}
	
	public void addProductsOfQ(ProductOfQ productQ, int quantity) {
		if (maxProducts > 0 && productQ.getQuantity() >= quantity) {
			ProductOfQ product = new ProductOfQ(productQ.getNameOfProduct(), productQ.getPrice(), quantity);
			shoppingCart.add(product);
			System.out.println("Buyer " + this.id + " add " + quantity + " pieces of " + product.getNameOfProduct() + " to his cart.");
			productQ.setQuantity(productQ.getQuantity() - quantity);
			System.out.println("In the shop " + this.shopIn.getNameOfShop() + " lefts " + productQ.getQuantity() + " pieces " + productQ.getNameOfProduct());
			moneyToPay += product.getPrice() * quantity;
			System.out.println("All products's price in the shopping cart at this moment is: " + this.moneyToPay);
			System.out.println("Buyer " + this.id + " cash is: " + this.money);
			maxProducts--;
		} else {
			System.out.println("It has no free places or no enought quantity to add the product!");
		}
		System.out.println("--------------------------");
	}
	
	public void removeProductsOfKg(ProductOfKg product, double quantity) {
		if (this.shoppingCart.isEmpty()) {
			System.out.println("The shopping cart is empty!");
			return;
		} else {
			for (int i = 0; i < this.shoppingCart.size(); i++) {
				if (this.shoppingCart.get(i) instanceof ProductOfKg) {
					if (this.shoppingCart.get(i).getNameOfProduct().equals(product.getNameOfProduct()) &&
							((ProductOfKg) this.shoppingCart.get(i)).getQuantity() >= quantity && quantity > 0) {
							((ProductOfKg) this.shoppingCart.get(i)).setQuantity(((ProductOfKg) this.shoppingCart.get(i)).getQuantity() - quantity);
							System.out.println("Buyer " + this.id + " remove from his cart " + quantity + " kg of " + product.getNameOfProduct());
							product.setQuantity(product.getQuantity() + quantity);
							System.out.println(quantity + "kg " + product.getNameOfProduct() + " are back in the shop!");
							moneyToPay -= product.getPrice() * quantity;
							System.out.println("All products's price in the shopping cart at this moment is: " + this.moneyToPay);
							System.out.println("Buyer " + this.id + " cash is: " + this.money);
							break;
					} else {
						System.out.println("There is no such product or enought quantity!");
					}
				} else {
					continue;
				}
			}
		}
		System.out.println("--------------------------");
	}
	
	public void removeProductsOfQ(ProductOfQ product, int quantity) {
		if (this.shoppingCart.isEmpty()) {
			System.out.println("The shopping cart is empty!");
			return;
		} else {
			for (int i = 0; i < this.shoppingCart.size(); i++) {
				if (this.shoppingCart.get(i) instanceof ProductOfQ) {
					if ((this.shoppingCart.get(i).getNameOfProduct().equals(product.getNameOfProduct())) &&
							(((ProductOfQ) this.shoppingCart.get(i)).getQuantity() >= quantity && quantity > 0)) {
							((ProductOfQ) this.shoppingCart.get(i)).setQuantity(((ProductOfQ) this.shoppingCart.get(i)).getQuantity() - quantity);
							System.out.println("Buyer " + this.id + " remove from his cart " + quantity + " pieces of " + product.getNameOfProduct());
							product.setQuantity(product.getQuantity() + quantity);
							System.out.println(quantity + " pieces " + product.getNameOfProduct() + " are back in the shop!");
							moneyToPay -= product.getPrice() * quantity;
							System.out.println("All products's price in the shopping cart at this moment is: " + this.moneyToPay);
							System.out.println("Buyer " + this.id + " cash is: " + this.money);
							break;
					} else {
						System.out.println("There is no such product or enought quantity!");
					}
				} else {
					continue;
				}
			}
		}
		System.out.println("--------------------------");
	}
	
	public void payInCash() {
		if (this.money >= moneyToPay) {
			System.out.println("Buyer " + this.id + " pay the bill!");
			this.money -= moneyToPay;
			this.shopIn.setMoneyOfCash(this.shopIn.getMoneyOfCash() + moneyToPay);
			this.shoppingCart.removeAll(shoppingCart);
			moneyToPay = 0;
			System.out.println("--------------------------");
			this.shopIn.showInfoForShop();
		} else {
			System.out.println("It has no enought money to pay the bill!");
		}
	}
}
