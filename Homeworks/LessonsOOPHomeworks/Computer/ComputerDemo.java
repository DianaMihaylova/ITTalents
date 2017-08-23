package lesson16HomeworkComputer;

public class ComputerDemo {

	public static void main(String[] args) {
		
		Computer dell = new Computer(2016, 1500, 1000, 500, "Dell");
		
		Computer hpProBook = new Computer(2016, 1400, true, 1000, 300, "Win 8", "HP ProBook");
		
		Computer hpPavilion = new Computer(2017, 2000, true, 2000, 1000, "Win 10", "HP Pavilion");
		
		Computer hpOmen = new Computer(2017, 1600, true, 1000, 600, "", "HP Omen");
		
		hpOmen.changeOperationSystem("Win 10");
		
		hpPavilion.useMemory(400);
		
		int result = hpPavilion.comparePrice(hpProBook);
		
		if (result == -1) {
			System.out.println(hpPavilion.model + " is more expensive than " + hpProBook.model);
		} else if (result == 1) {
			System.out.println(hpProBook.model + " is more expensive than " + hpPavilion.model);
		} else {
			System.out.println(hpPavilion.model + "'s price is equal to the " + hpProBook.model + "'s price");
		}
		
		System.out.println();
		
		dell.print();
		System.out.println();
		
		hpProBook.print();
		System.out.println();
		
		hpPavilion.print();
		System.out.println();
		
		hpOmen.print();
	}
}
