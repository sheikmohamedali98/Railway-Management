import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Train {
	
	static final Map<Integer,String> workingdays;
	
	static{
		HashMap<Integer,String> temp = new HashMap<Integer,String>();
		 temp.put(1, "SUN");
		 temp.put(2,"MON");
		 temp.put(3, "TUE");
		 temp.put(4, "WED");
		 temp.put(5, "THU");
		 temp.put(6, "FRI");
		 temp.put(7, "SAT");
		 workingdays = Collections.unmodifiableMap(temp);
		 
	}
	
	private String startcity;
	private String endcity;
	private double trainfare;
	private String trainName;
	private int trainNumber;
	private int numberOfSeats;
	private HashMap<String, Integer> operatingdays;
	private static int trainNumberGenerator = 0;
	
	public int getNumberOfSeats(){
		return numberOfSeats;
	}
	
	protected void setNumberOfSeats(int numberOfSeats){
		this.numberOfSeats = numberOfSeats; 
	}
	
	public String getTrainName(){
		return trainName;
	}
	
	protected void setTrainName(String trainName){
	   this.trainName = trainName;
	}

	
	public String getStartCity(){
		return startcity.toLowerCase();
	}
	
	protected void setStartCity(String startcity){
		this.startcity = startcity;
	}
	
	public HashMap<String,Integer> getOperatingDays(){
		return operatingdays;
	}
	protected void setOperatingDays(int days){
		operatingdays = new HashMap<String,Integer>();
		
		int temp = days;
		while(temp!=0){
			
			int rem = temp%10;
			String str = workingdays.get(rem);
			operatingdays.put(str, 1);
			temp = temp/10;
			
		}}
		
		public String getEndCity(){
			return endcity.toLowerCase();
			
		}
		
		
		protected void setEndCity(String endcity){
			this.endcity = endcity;
		}
		
		public double getTrainFare(){
			return trainfare;
		}
	
	    protected void setTrainFare(double trainfare){
	    	this.trainfare = trainfare;
	    	
	    }
	    
	    public int getTrainNumber(){
	    	return trainNumber;
	    }
	    Train(){
	    	trainNumberGenerator++;
	    	trainNumber = trainNumberGenerator;
	    }
}
