import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class EnquireMain {
	HashMap<Integer,Train> enquire() throws Exception{
		HashMap<Integer,Train> trainAvailable = new HashMap<Integer,Train>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-------------------------");
		
		System.out.println("1) Enter Start city : ");
		String startcity = br.readLine();
		System.out.println("2) Enter End city : ");
		String endcity = br.readLine();
		System.out.println("3) Enter Travel Date (dd/MM/yyyy): ");
		String dateString  = br.readLine();
		//can we convert date to text
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
		 SimpleDateFormat sdf = new SimpleDateFormat("EEE");
		String day = sdf.format(date);
		day = day.toUpperCase();
		System.out.println(day);
		
		HashMap<Integer,Train> trainDetails = TrainTimeTable.getTrainList();
		
		for(Map.Entry<Integer,Train> entry : trainDetails.entrySet()){
			Train t = entry.getValue();
			String t_startCity = t.getStartCity();
			String t_endCity = t.getEndCity();
			
			HashMap<String,Integer> operatingDays = t.getOperatingDays();
			
			 if(startcity.equals(t_startCity)&&endcity.equals(t_endCity)){
				 
				 if((operatingDays.get(day) == 1)||(operatingDays.get(day) == 2)||(operatingDays.get(day) == 3)||(operatingDays.get(day) == 4)||(operatingDays.get(day) == 5)||(operatingDays.get(day) == 6)||(operatingDays.get(day) == 7)){
					 System.out.println("--------------------------");
					 System.out.println("Train number :"+t.getTrainNumber());
					 System.out.println("Train Start City :"+t.getStartCity());
					 System.out.println("Train End City :"+t.getEndCity());
					 System.out.println("Train Name : "+t.getTrainName());
					 System.out.println("Train Fare : "+t.getTrainFare());
					 System.out.println("Number of seats available :"+t.getNumberOfSeats());
					 trainAvailable.put(t.getTrainNumber(), t);
					 
				 }
				 
			 }
		}
	
	return trainAvailable;
	}
}
