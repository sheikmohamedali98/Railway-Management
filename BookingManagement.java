import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;


public class BookingManagement {
	EnquireMain Emain;
	BookingMain Bmain ;
	PaymentMain Pmain;
	CancellationManagement Cmange; 
	Scanner in = new Scanner(System.in);
	
	
	public int booking(User user)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		
		System.out.println("--------------------------------------");
		System.out.println("1) Enquire");
		System.out.println("2) Book Ticket");
		System.out.println("3) Cancel Ticket");
		System.out.println("4) Return To Previous Menu");
		
		System.out.println("Enter Your Choice : ");
		int choice = Integer.parseInt(br.readLine());
		
		if(choice == 1){
			HashMap<Integer,Train> tt = enquiry();
			if(tt.isEmpty()){
				System.out.println("No  train for given details");
			}
			return 0;
		}
		else if(choice == 2){
			HashMap<Integer,Train> tt = enquiry();
            if(!tt.isEmpty()){
//	           while(true){
	        	   System.out.println("Select train number for book");
	        	   int n = in.nextInt();
	        	   if(tt.containsKey(n)){
	        		   Train t = tt.get(n);
	        		   
	        		   //For Seats Booking And Payment
	        		   if(t.getNumberOfSeats()>0){
	        			   System.out.println(t.getTrainName()+" Train Has Number Of "+t.getNumberOfSeats()+"Seats");
	        			   System.out.println("booking");
	        			   if(Bmain == null){
	        				   Bmain = new BookingMain();
	        			   }
	        			   if(Pmain == null){
	        				   Pmain = new PaymentMain();
	        			   }
	        			   if(Pmain.dedutbalance(t, user)){
	        				   Bmain.bookTicket(n, user);
	        			   }
	        			   else{
	        				   System.out.println("User Has Been Booking Fail,Insuffcient Balance");
	        			   }
	        		   }
	        		   else{
	        			   System.out.println("Train Ticket Is Full,Does't Have Any Seats");
	        		   }
	        	   }
	        		   
	        		   else{
		        		   System.out.println("PLease Enter Correct Valid Train Number");
		        	   }
	        	   
	        	   return 0;
	        	  
	           }
	          
            
            
            else if(choice == 3){
            	if(Cmange == null){
            		Cmange = new CancellationManagement();
            	}
            	Cmange.cancelTicket(user);
            	
            }
            
		}
		return 1;
		}
	private HashMap<Integer, Train> enquiry() throws Exception {
		if(Emain == null){
			Emain = new EnquireMain();
		}
		HashMap<Integer,Train> t = Emain.enquire();
		return t;		
	}

}
