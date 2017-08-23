package lesson16HomeworkCarShop;

public class Car {
	
	String model;
	private int maxSpeed;
	private int currentSpeed;
	String color;
	private int numOfTires;
	int gear;
	Person owner;
	int price;
	boolean isSportCar;
	double priceForScrap;
	
	public Car() {
		setNumOfTires(4);
	}
	
	public Car(String model, boolean isSportCar, String color, int numOfTires) {
		this();
		this.model = model;
		this.isSportCar = isSportCar;
		this.color = color;
	}
	
	public Car(String model, boolean isSportCar, String color, int numOfTires, int maxSpeed, int currentSpeed, int gear, int price) {
		this(model, isSportCar, color, numOfTires);
		this.setMaxSpeed(maxSpeed);
		this.setCurrentSpeed(currentSpeed);
		this.gear = gear;
		this.price = price;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed > 200) {
			this.maxSpeed = maxSpeed;
		} else {
			System.out.println("The speed is not valid!");
			return;
		}
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		if (currentSpeed > 0) {
			this.currentSpeed = currentSpeed;
		} else {
			System.out.println("The speed is not valid!");
			return;
		}	
	}

	public int getNumOfTires() {
		return numOfTires;
	}

	public void setNumOfTires(int numOfTires) {
		if (numOfTires != 4) {
			System.out.println("The num of tires is not valid!");
			return;
		} else {
			this.numOfTires = numOfTires;
		}
	}
	
	boolean isMoreExpensive(Car car) {
		if (this.price > car.price) {
			System.out.println(this.model + " is more expensive than " + car.model);
			return true;
		} else if (this.price < car.price){
			System.out.println(this.model + " is not more expensive than " + car.model);
			return false;
		} else {
			System.out.println(this.model + "'s price is equal to " + car.model);
			return false;
		}
	}
	
	double calculateCarPriceForScrap(double metalPrice) {
		double coef = 0.2;
		if (this.color.equals("Black") || this.color.equals("White")) {
			coef += 0.05;
		}
		if (this.isSportCar) {
			coef += 0.05;
		}
		priceForScrap = metalPrice * coef;
		System.out.println("Price for scrap is: " + priceForScrap);
		return priceForScrap;
	}
	
	void changeOwner(Person newOwner) {
		if (newOwner != null) {
			this.owner = newOwner;
		} else {
			System.out.println("The owner is not valid!");
			return;
		}
	}
}
