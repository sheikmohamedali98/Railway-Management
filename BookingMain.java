
public class BookingMain extends Train {
	
	void bookTicket(int n,User user ){
		Train t = TrainTimeTable.getTrainList().get(n);
		System.out.println("------------------------------------------");
		System.out.println("From City"+t.getStartCity());
		System.out.println("End City"+t.getEndCity());
		int seats = t.getNumberOfSeats()-1;
		
		Ticket ticket = new Ticket();
		
		ticket.setStartCity(t.getStartCity());
		ticket.setEndCity(t.getStartCity());
		ticket.setFare(t.getTrainFare());
		
		user.booking.put(ticket.getBookingNumber(), ticket);
		t.setNumberOfSeats(seats);
		
		TrainTimeTable.setTrainList(t);
		
		
		System.out.println("Available Seats :"+seats);
		
		System.out.println("-----------------------------------------------------");
		
		
	}

}
