

public class Ticket extends BookingManagement {


	
	private String startcity;
	private String endcity;
	private int bookingNumber;
	private String trainName;
	private static int bookingNumberGenerator = 0;
	private double fare;
	
	Ticket(){
		bookingNumberGenerator++;
		bookingNumber  = bookingNumberGenerator; 
	}
	
	
	public double getFare(){
		return fare;
	}
	
	protected void setFare(Double doublel){
		this.fare = doublel;
	}
	public String getTrainName(){
		return trainName;
	}
	protected void setTrainName(String trainName){
		this.trainName = trainName;
	}
	
	public String getStartCity(){
		return startcity;
		
	}
	  
	public String getEndCity(){
		return endcity;
	}
	
	public int getBookingNumber(){
		return bookingNumber;
	}
	
	
	protected void setStartCity(String startcity){
		this.startcity = startcity;
	}
	
	protected void setEndCity(String endcity){
		this.endcity = endcity;
	}

	
}

