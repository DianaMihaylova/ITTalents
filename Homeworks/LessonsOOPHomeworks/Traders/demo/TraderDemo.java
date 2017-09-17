package demo;

import java.util.ArrayList;
import java.util.Random;

import providers.ProvDrebno;
import providers.ProvEdro;
import providers.Provider;
import traderObjects.Budka;
import traderObjects.IETTO;
import traderObjects.ITurgVeriga;
import traderObjects.Magazin;
import traderObjects.Sergiq;
import traderObjects.TraderObject;
import traders.Ambulanten;
import traders.ET;
import traders.Trader;
import traders.TurgovskaVeriga;

public class TraderDemo {
	
	public static Provider[] providers = new Provider[10];

	public static void main(String[] args) {
		
		for (int i = 0; i < providers.length; i++) {
			if (new Random().nextBoolean()) {
				providers[i] = new ProvDrebno("ProvDrebno" + i, "Sofia" + i, "non stop");
			} else {
				providers[i] = new ProvEdro("ProvEdro" + i, "Sofia" + i, "8 - 20");
			}
		}
		
		TraderObject[] traderObjects = new TraderObject[20];
		for (int i = 0; i < traderObjects.length; i++) {
			switch (new Random().nextInt(3)) {
				case 0: 
					traderObjects[i] = new Budka("Sofia" + i, "8 - 18", new Random().nextInt(6-4) + 4);
					break;
				case 1:
					traderObjects[i] = new Sergiq("Sofia" + i, "10 - 17", new Random().nextInt(10-2) + 2);
					break;
				case 2:
					traderObjects[i] = new Magazin("Sofia" + i, "9 - 22", new Random().nextInt(90-10) + 10);
					break;
			}
		}
		
		Ambulanten ambulanten = new Ambulanten("Ambulanten", "OK", 100);
		ET et = new ET("ET", "Mladost", 500);
		TurgovskaVeriga trgVeriga = new TurgovskaVeriga("Turgovska Veriga", "Lulin", 3000);
		
		int rand = new Random().nextInt(traderObjects.length);
		if (traderObjects[rand] instanceof IETTO) {
			et.setTraderObject((IETTO) traderObjects[rand]);
		}
		
		rand = new Random().nextInt(traderObjects.length);
		if (traderObjects[rand] instanceof ITurgVeriga) {
			trgVeriga.setTradersObjects((ITurgVeriga) traderObjects[rand]);
		}
		
		ArrayList<Trader> traders = new ArrayList<>();
		traders.add(ambulanten);
		traders.add(et);
		traders.add(trgVeriga);
		
		makeBusiness(traders);
		
		for (int i = 0; i < traders.size(); i++) {
			System.out.println("The capital of " + traders.get(i).getName() + " is: " + traders.get(i).getCapital());
		}
	}
	
	public static void makeBusiness(ArrayList<Trader> traders) {
		int rand = 0;
		for (int i = 0; i < traders.size(); i++) {
			if (traders.get(i) instanceof Ambulanten) {
				while (!(providers[rand] instanceof ProvDrebno)) {
					rand = new Random().nextInt(providers.length);
				}
				System.out.println("The trader " + traders.get(i).getName() + " buy stock from " + providers[rand].getName());
				traders.get(i).makeOrder(new Random().nextInt(50), providers[rand]);
				traders.get(i).collectMoney();
				rand = 0;
			} else if (traders.get(i) instanceof ET) {
				while (!(providers[rand] instanceof ProvDrebno)) {
					rand = new Random().nextInt(providers.length);
				}
				System.out.println("The trader " + traders.get(i).getName() + " buy stock from " + providers[rand].getName());
				traders.get(i).makeOrder(new Random().nextInt(250), providers[rand]);
				traders.get(i).collectMoney();
				traders.get(i).payTax((TraderObject) ((ET) traders.get(i)).getTraderObject());
				rand = 0;
			} else {
				rand = new Random().nextInt(providers.length);
				System.out.println("The trader " + traders.get(i).getName() + " buy stock from " + providers[rand].getName());
				traders.get(i).makeOrder(new Random().nextInt(1500), providers[rand]);
				traders.get(i).collectMoney();
				rand = new Random().nextInt(((TurgovskaVeriga) traders.get(i)).getTradersObjects().length);
				traders.get(i).payTax((TraderObject) ((TurgovskaVeriga) traders.get(i)).getTradersObjects()[rand]);
				rand = 0;
			}
			System.out.println("===========================================");
		}
	}
}
