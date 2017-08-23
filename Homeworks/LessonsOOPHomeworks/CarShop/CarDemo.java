package lesson16HomeworkCarShop;

public class CarDemo {

	public static void main(String[] args) {
		
		Car audi = new Car("Audi", true, "Pink", 4, 300, 90, 4, 20000);
		Car mercedes = new Car("Mercedes", false, "Blue", 4, 260, 50, 3, 12000);
		Car volga = new Car("Volga", false, "White", 4);
		Car honda = new Car("Honda", true, "Red", 4, 360, 160, 5, 169000);
		Car golf = new Car("Golf", false, "Silver", 4, 290, 69, 4, 15000);
		
		CarShop fakt = new CarShop(10);
		fakt.addCar(audi);
		fakt.addCar(mercedes);
		fakt.addCar(volga);
		fakt.addCar(honda);
		fakt.addCar(golf);
		
		Person nikol = new Person("Nikol", 26, false, 100000);
		Person emo = new Person("Emo", 29, true, 90000);
		Person boris = new Person("Boris", 31, true, 17500);
		
		System.out.println();
		audi.isMoreExpensive(mercedes);
		
		System.out.println();
		emo.buyCar(golf);
		System.out.println("The owner of the " + golf.model + " is " + golf.owner.getName());
		System.out.println(emo.getName() + "'s money are " + emo.money);
		
		System.out.println();
		golf.changeOwner(boris);
		System.out.println("The owner of the " + golf.model + " is " + golf.owner.getName());
		System.out.println();
		
		fakt.sellNextCar(nikol);
		System.out.println(nikol.getName() + " has a car " + nikol.car.model);
		audi.calculateCarPriceForScrap(1900);
		System.out.println(nikol.getName() + " has " + nikol.sellCarForScrap() + " money.");
		fakt.sellNextCar(nikol);
		System.out.println(nikol.getName() + " has a car " + nikol.car.model);
		
		System.out.println();
		fakt.showAllCarsInTheShop();
	}
}
