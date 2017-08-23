package lesson16HomeworkCarShop;

public class CarShop {
	
	Car[] cars;
	int currentCar = 0;
	
	public CarShop(int capacity) {
		if (capacity > 0) {
			cars = new Car[capacity];
		}
	}
	
	boolean addCar(Car car) {
		boolean result = false;
		if (cars[cars.length - 1] == null) {
			for (int i = 0; i < cars.length; i++) {
				if (cars[i] == null) {
					cars[i] = car;
					result = true;
					System.out.println(car.model + " is added in place " + i + " to the shop.");
					break;
				}
			}
		} else {
			System.out.println("There is no more free palces in the shop!");
		}
		return result;
	}
	
	Car getNextCar() {
		Car nextCar = null;
		for (int i = currentCar; i < cars.length; i++) {
			if (cars[i] != null) {
				currentCar = i;		
				nextCar = cars[i];	
				break;
			}
		}
		return nextCar;	
	}
	
	void sellNextCar(Person buyer) {
		Car sellCar = getNextCar();
		if (sellCar != null) {
			sellCar.owner = buyer;
			buyer.car = sellCar;
			buyer.money -= sellCar.price;
			removeCar(sellCar);
		} else {
			System.out.println("No more next cars!");
		}	
	}
	
	boolean removeCar(Car car) {
		boolean result = false;
		for (int i = 0; i < cars.length; i++) {
			if (car == cars[i]) {
				cars[i] = null;
				result = true;
				break;
			}
		}
		return result;
	}
	
	void showAllCarsInTheShop() {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null) {
				System.out.println("Model: " + cars[i].model);
				System.out.println("Color: " + cars[i].color);
				System.out.println("Max speed: " + cars[i].getMaxSpeed());
				System.out.println("Current speed: " + cars[i].getCurrentSpeed());
				System.out.println("Price: " + cars[i].price);
				System.out.println("Is it sports car: " + cars[i].isSportCar);
				System.out.println();
			} 
		}
	}
}
