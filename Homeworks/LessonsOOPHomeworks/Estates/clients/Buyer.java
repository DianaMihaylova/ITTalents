package clients;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import agency.Agency;
import agency.View;
import estates.Estate;

public class Buyer extends Client {
	
	private static final double PERCENT_FOR_ESTATE = 0.03;
	private ArrayList<View> views;

	public Buyer(String name, String tel, double money) {
		super(name, tel, money);
		views = new ArrayList<>();
	}
	
	public void addView(View v) {
		if (v != null) {
			this.views.add(v);
		}
	}
	
	public List<View> getViews() {
		return Collections.unmodifiableList(views);
	}

	public void questionForEstate(Agency ag) {
		if (ag != null) {
			int rand = new Random().nextInt(ag.getAgents().size());
			this.agent = ag.getAgents().get(rand);
			ag.getAgents().get(rand).addBuyer(this);
		}		
	}
	
	public void makeView(Estate e, Agency a) {
		if (e != null && a != null) {
			for (Iterator<TreeSet<Estate>> it = a.getCatalog().values().iterator(); it.hasNext();) {
				TreeSet<Estate> estate = it.next();
				for (Estate est : estate) {
					if (est == e) {
						if (e.getPrice() < this.getMoney()) {
							View view = new View(e, e.getAgent(), this, LocalDate.now());
							this.views.add(view);
							this.agent = e.getAgent();
							this.agent.addView(view);
							e.getAgent().addBuyer(this);
						}
					} 
				}
			} 
		}
	}

	public void buyEstate(Estate e, Agency a) {
		if (e != null && a != null) {
			for (View view : views) {
				if (view.getEstate() == e) {
					this.estate = e;
					this.setMoney(this.getMoney() - e.getPrice() - (e.getPrice()*PERCENT_FOR_ESTATE));
					a.setMoneyInCash(a.getMoneyInCash() + ((e.getPrice()*PERCENT_FOR_ESTATE)*2));
					e.getAgent().setSalary(e.getAgent().getSalary() + (e.getPrice()*PERCENT_FOR_ESTATE));
					for (Iterator<Seller> it = e.getAgent().getSellers().iterator(); it.hasNext();) {
						Seller s = it.next();
						if (s.getEstate() == e) {
							s.setMoney(s.getMoney() + e.getPrice() - (e.getPrice()*PERCENT_FOR_ESTATE));
						}
					}
				}
			}
		}
	}
}
