public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets;

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void setAvailableTickets(int avaTickets) {
		if (avaTickets > 0) {

			availableTickets = avaTickets;
		}

	}

	public int getTickets() {
		return availableTickets;
	}

	public int getPrice() {
		return price;
	}

	public int getTicketid() {
		return ticketid;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public int calculateTicketCost(int nooftickets) {
		System.out.println("Available tickets:" + availableTickets);
		if (availableTickets > nooftickets) {
			availableTickets -= nooftickets;
			return (nooftickets * price);
		} else {
			return -1;
		}
	}
}