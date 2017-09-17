package agency;

import java.time.LocalDate;
import clients.Buyer;
import estates.Estate;

public class View {

	private Estate estate;
	private Agent agent;
	private Buyer buyer;
	private LocalDate date;
	
	public View(Estate estate, Agent agent, Buyer buyer, LocalDate date) {
		if (estate != null) {
			this.estate = estate;
		}
		if (agent != null) {
			this.agent = agent;
		}
		if (buyer != null) {
			this.buyer = buyer;
		}
		if (date != null) {
			this.date = date;
		}
	}
	
	public Estate getEstate() {
		return estate;
	}

	@Override
	public String toString() {
		return "View [estate=" + estate + ", agent=" + agent + ", buyer=" + buyer + "]";
	}
}
