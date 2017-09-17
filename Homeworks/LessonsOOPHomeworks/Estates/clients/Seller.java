package clients;

import java.util.Random;

import agency.Agency;
import estates.Estate;

public class Seller extends Client {

	public Seller(String name, String tel, double money) {
		super(name, tel, money);
	}

	public void setEstate(Estate estate) {
		if (estate != null) {
			this.estate = estate;
		}
	}
	
	public void regEstate(Agency ag) {
		if (ag != null) {
			int rand = new Random().nextInt(ag.getAgents().size());
			this.agent = ag.getAgents().get(rand);
			this.estate.setAgent(ag.getAgents().get(rand));
			ag.addEstate(this.estate);
			ag.getAgents().get(rand).addSeller(this);
		}
	}
}
