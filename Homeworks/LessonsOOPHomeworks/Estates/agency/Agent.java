package agency;

import java.util.ArrayList;
import java.util.HashSet;

import clients.Buyer;
import clients.Seller;

public class Agent implements Comparable<Agent> {

	private String name;
	private String tel;
	private double salary;
	private HashSet<Seller> sellers;
	private HashSet<Buyer> buyers;
	private ArrayList<View> views;
	
	public Agent(String name, String tel) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (tel != null && !tel.isEmpty()) {
			this.tel = tel;
		}
		this.sellers = new HashSet<>();
		this.buyers = new HashSet<>();
		this.views = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		}
	}

	public void addSeller(Seller s) {
		if (s != null) {
			sellers.add(s);
		}
	}
	
	public void addBuyer(Buyer b) {
		if (b != null) {
			buyers.add(b);
		}
	}
	
	public void addView(View v) {
		if (v != null) {
			this.views.add(v);
		}
	}
	
	public HashSet<Seller> getSellers() {
		return sellers;
	}

	@Override
	public String toString() {
		return "Agent [name=" + name + ", tel=" + tel + "]";
	}

	@Override
	public int compareTo(Agent o) {
		double result = (this.salary - o.salary) * -1;
		if (result > 0) {
			return 1;
		} 
		if (result < 0) {
			return -1;
		}
		return 0;
	}
}
