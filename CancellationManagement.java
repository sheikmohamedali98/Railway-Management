import java.util.HashMap;
import java.util.Scanner;


public class CancellationManagement {//cancel
 static Scanner in = new Scanner(System.in);
 PaymentMain pmain;
 
 void cancelTicket(User user){
	 System.out.println("....Your Journy Details......");
	 HashMap <Integer,Ticket> bookings = user.getBookings();
	 
	 for(Ticket ticket: bookings.values()){
		 System.out.println("Booking Number :"+ticket.getBookingNumber());
		 System.out.println("From City : "+ticket.getStartCity());
		 System.out.println("To City : "+ticket.getEndCity());
	 }
		 
		 System.out.println("\t------------------------------------------------");
		 
		 System.out.println("Enter your cancellation Ticket Number:");
		 int ticketNumber = in.nextInt();
		 
		 if(bookings.containsKey(ticketNumber)){
			 Ticket t = bookings.get(ticketNumber);
			 System.out.println(" Your Ticket Has Been Cancelled Sucessfully");
			 System.out.println("amount "+t.getFare()+"has Been Credited back to Your Account");
			 
			 
			 if(pmain == null){//if payment null generate new refund
				 pmain = new PaymentMain();
				 
			 }
			 
			 pmain.refund(user, t);
			 user.removeBooking(ticketNumber);
			 
		 }
		 
		 else{
			 System.out.println("Please Enter Valid Ticket Number");
		 }
		 
		 
	 }
	
 }

