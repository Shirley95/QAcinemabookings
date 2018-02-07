package cinemaBookings.Bookings;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Testing {

	Booking b = new Booking();

	Ticket standard = new Ticket("standard", 8);
	Ticket oap = new Ticket("oap", 6);
	Ticket student = new Ticket("student", 6);
	Ticket child = new Ticket("child", 4);


	@Before
	public void setUp() {
		b.ticketBought.add(standard);
		b.ticketBought.add(student);
		b.ticketBought.add(child);
	}

	
	 @Test
	 public void evaluateTicketPrices() {
	 assertEquals(8, standard.getPrice());
	 assertEquals(6, oap.getPrice());
	 assertEquals(6, student.getPrice());
	 assertEquals(4, child.getPrice());
	 }

	@Test
	public void evaluateDiscount() {
		assertEquals(6, b.discount(standard));
		assertEquals(4, b.discount(oap));
		assertEquals(4, b.discount(student));
		assertEquals(2, b.discount(child));
	}

	 @Test
	 public void evaluateTotalCost() {
	 assertEquals(18, b.totalCost(Days.MONDAY));
	 assertEquals(12, b.totalCost(Days.WEDNESDAY));
	 }

}
