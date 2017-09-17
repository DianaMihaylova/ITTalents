package clients;

import agency.Agent;
import estates.Estate;

public abstract class Client {
	
	private String name;
	private String tel;
	private double money;
	protected Agent agent;
	protected Estate estate;
	
	public Client(String name, String tel, double money) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (tel != null && !tel.isEmpty()) {
			this.tel = tel;
		}
		if (money > 0) {
			this.money = money;
		}
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Estate getEstate() {
		return estate;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", tel=" + tel + "]";
	}
}
