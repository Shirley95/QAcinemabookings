package cinemaBookings.Bookings;

public class Ticket {
	
	private String ticketType;
	private int price;
	
	public Ticket(String ticketType, int price) {
		super();
		this.ticketType = ticketType;
		this.price = price;
	}
	
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ticket [ticketType=" + ticketType + ", price=" + price + "]";
	}

}
