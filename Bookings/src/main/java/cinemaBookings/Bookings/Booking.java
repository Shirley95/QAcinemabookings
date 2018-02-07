package cinemaBookings.Bookings;

import java.util.ArrayList;

public class Booking {

	
	ArrayList<Ticket> ticketBought = new ArrayList<>();
	
	public int discount(Ticket t) {
		return t.getPrice() - 2;
	}
	
	public int totalCost(Days day) {
		int total = 0;
		for (Ticket ticket : ticketBought) {
			if (day == Days.WEDNESDAY) {
				total += discount(ticket);
			}
			else {
				total += ticket.getPrice();
			}
		}
		return total;
	} 
	
}
