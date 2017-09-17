
package agency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.Random;
import estates.Estate;

public class Agency {
	
	private String name;
	private String address;
	private String tel;
	private double moneyInCash;
	ArrayList<Agent> agents;
	HashMap<Estate.Category, TreeSet<Estate>> catalog;
	
	public Agency(String name, String address, String tel) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (address != null && !address.isEmpty()) {
			this.address = address;
		}
		if (tel != null && tel.isEmpty() && tel.matches("[0-9]")) {
			this.tel = tel;
		}
		this.agents = new ArrayList<>();
		this.catalog = new HashMap<>();
	}

	public void setMoneyInCash(double moneyInCash) {
		if (moneyInCash > 0) {
			this.moneyInCash = moneyInCash;
		}
	}

	public double getMoneyInCash() {
		return moneyInCash;
	}

	public void addAgent(Agent a) {
		if (a != null) {
			agents.add(a);
		}
	}

	public List<Agent> getAgents() {
		return Collections.unmodifiableList(agents);
	}

	public void addEstate(Estate e) {
		if (e != null) {
			if (!catalog.containsKey(e.getCategory())) {
				catalog.put(e.getCategory(), new TreeSet<Estate>());
			}
			catalog.get(e.getCategory()).add(e);
		}
	}
	
	public Map<Estate.Category, TreeSet<Estate>> getCatalog() {
		return Collections.unmodifiableMap(catalog);
	}
	
	public Estate randomEstate() {
		Random random = new Random();
		List<Estate.Category> keys = new ArrayList<>(catalog.keySet());
		Estate.Category randomKey = keys.get(random.nextInt(keys.size()));
		TreeSet<Estate> value = catalog.get(randomKey);
		List<Estate> arrValue = new ArrayList<>(value);
		Estate estate = arrValue.get(random.nextInt(arrValue.size()));
		return estate;
	}

	public void printCatalog() {
		for (Iterator<Entry<Estate.Category, TreeSet<Estate>>> it = catalog.entrySet().iterator(); it.hasNext();) {
			Entry<Estate.Category, TreeSet<Estate>> e = it.next();
			System.out.println("============================== " + e.getKey() + " ==============================");
			for (Estate est : e.getValue()) {
				System.out.println(est);
			}
		}
	}
}
