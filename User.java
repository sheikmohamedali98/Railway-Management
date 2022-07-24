import java.util.HashMap;
import java.util.Random;


public class User {
	String username;
	String password;
	
	public double creditcoin;
	public double debitcoin;
	BookingManagement bookingmanagement;
	HashMap<Integer,Ticket> booking;
	
	
	public HashMap<Integer,Ticket> getBookings(){
		return booking;
	}

	public void setBookings(Ticket ticket){
		booking.put(ticket.getBookingNumber(),ticket);
		
	}
	 public void removeBooking(int bookingNumber){
		 booking.remove(bookingNumber);
	 }
	 
	 User(){
		 bookingmanagement  = new  BookingManagement();
		 booking = new HashMap<Integer,Ticket>();
	 }
	 
	 double generateRandom(int rangeMin, int rangeMax){
		 Random r = new Random();
		 double balance = rangeMin+(rangeMax-rangeMin)*r.nextDouble();
		 return balance;
	 
}
}
