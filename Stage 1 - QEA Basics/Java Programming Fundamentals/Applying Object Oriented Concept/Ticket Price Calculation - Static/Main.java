import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Ticket t = new Ticket();
		Scanner sc = new Scanner(System.in);
		int n, availableTickets, ticketid, price, nooftickets;
		System.out.println("Enter no of bookings:");
		n = sc.nextInt();
		System.out.println("Enter the available tickets: ");
		availableTickets = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the ticketid:");
			ticketid = sc.nextInt();
			System.out.println("Enter the price:");
			price = sc.nextInt();
			System.out.println("Enter the no of tickets:");
			nooftickets = sc.nextInt();

			t.setTicketid(ticketid);
			t.setPrice(price);
			t.setAvailableTickets(availableTickets);

			// System.out.println("Available tickets: "+t.getTickets());
			System.out.println("Total amount:" + t.calculateTicketCost(nooftickets));
			System.out.println("Available tickets after booking:" + t.getAvailableTickets());
		}
		sc.close();
	}
}