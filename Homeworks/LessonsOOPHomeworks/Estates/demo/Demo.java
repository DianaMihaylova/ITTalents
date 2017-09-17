package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import agency.Agency;
import agency.Agent;
import clients.Buyer;
import clients.Seller;
import estates.Apartment;
import estates.Apartment.TypeOfApartment;
import estates.Estate;
import estates.House;
import estates.House.TypeOfHouse;
import estates.IConstruction;
import estates.PlaceOfLand;
import estates.PlaceOfLand.TypeOfPanel;

public class Demo {

	public static void main(String[] args) {
		
		Agency talents = new Agency("Talents Estate", "Bulgaria", "0883968596");
		
		for (int i = 0; i < 5; i++) {
			Agent a = new Agent(nameGenerator(), "088935619" + i);
			talents.addAgent(a);
		}
		
		ArrayList<Seller> sellers = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			Seller s = new Seller(nameGenerator(), "088768934" + i, 0);
			sellers.add(s);
		}
		
		for (int i = 0; i < sellers.size(); i++) {
			Estate est = null;
			switch (new Random().nextInt(3)) {
				case 0:
					est = new Apartment("Description" + i, "Sofia" + i, new Random().nextInt(150000-70000) + 70000, 90 + i, 
						  randomElement(TypeOfApartment.values()), randomElement(IConstruction.Construction.values()));
					sellers.get(i).setEstate(est);
					break;
				case 1:
					est = new House("Description" + i, "Sofia" + i, new Random().nextInt(80000-50000) + 50000, 120 + i, 
						  2 + i, 20 + i, randomElement(TypeOfHouse.values()), randomElement(IConstruction.Construction.values()));
					sellers.get(i).setEstate(est);
					break;
				case 2:
					est = new PlaceOfLand("Description" + i, "Sofia" + i, new Random().nextInt(85000-30000) + 30000, 69 + i, 
						  new Random().nextBoolean(), randomElement(TypeOfPanel.values()));
					sellers.get(i).setEstate(est);
					break;
			}
		}
		
		for (int i = 0; i < sellers.size(); i++) {
			sellers.get(i).regEstate(talents);
		}
		
		talents.printCatalog();
		
		ArrayList<Buyer> buyers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Buyer b = new Buyer(nameGenerator(), "088965879" + i, new Random().nextInt(150000-30000) + 30000);
			buyers.add(b);
		}
		
		for (int i = 0; i < buyers.size(); i++) {
			buyers.get(i).questionForEstate(talents);
			for (int j = 0; j < 3; j++) {
				buyers.get(i).makeView(talents.randomEstate(), talents);
			}
		}
		
		for (int i = 0; i < buyers.size(); i++) {
			System.out.println(buyers.get(i).getViews());
			if (buyers.get(i).getViews().size() > 0) {
				int rand = new Random().nextInt(buyers.get(i).getViews().size());
				buyers.get(i).buyEstate(buyers.get(i).getViews().get(rand).getEstate(), talents);
			}
		}
		
		System.out.println("Agency money: " + talents.getMoneyInCash());
		
		TreeSet<Agent> agents = new TreeSet<>();
		for (int i = 0; i < talents.getAgents().size(); i++) {
			agents.add(talents.getAgents().get(i));
		}
		
		for (Iterator<Agent> it = agents.iterator(); it.hasNext();) {
			Agent agent = it.next();
			System.out.println(agent.getName() + " - " + agent.getSalary());
		}	
	}
	
	public static String nameGenerator() {
		String[] names = {"Boris", "Nikol", "Emo", "Alex", "Monika", "Raya", "Moni", "Nikita", "Michael", "Billy"};
		String name = names[new Random().nextInt(names.length)];
		return name;
	}
	
	public static <T> T randomElement(T[] elements) {
		return elements[new Random().nextInt(elements.length)];
	}
}
