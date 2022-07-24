import java.util.Scanner;


public class TrainManagement extends Train{
	
	
	static Scanner in = new Scanner(System.in);
	private static  TrainManagement  tadmin;
	
  
	private TrainManagement(){
		trains();
	}
	
	private void trains(){
		Train t1 = new Train();
		Train t2 = new Train();
		Train t3 = new Train();
		Train t4 = new Train();
		Train t5 = new Train();
		
		t2.setStartCity("Madurai");
		t2.setEndCity("Chennai");
		t2.setTrainName("VAIGAI SF Express");
		t2.setTrainFare(462.00);
		t2.setNumberOfSeats(120);
		t2.setOperatingDays(1234567);
		
		
		
		t1.setStartCity("Tenkasi");
		t1.setEndCity("Madurai");
		t1.setTrainName("SENSOTTAI Pothigai SF Express");
		t1.setTrainFare(161.00);
		t1.setNumberOfSeats(100);
		t1.setOperatingDays(123456);
		
		t3.setStartCity("Madutai");
		t3.setEndCity("Delhi");
		t3.setTrainName("Rajdhani Express");
		t3.setTrainFare(2574.00);
		t3.setNumberOfSeats(320);
		t3.setOperatingDays(135);
		
		t4.setStartCity("Madurai");
		t4.setEndCity("Salem");
		t4.setTrainName("MYSURE Express");
		t4.setTrainFare(233.00);
		t4.setNumberOfSeats(80);
		t4.setOperatingDays(12345);
		
		
		t5.setStartCity("Madurai");
		t5.setEndCity("Kannyakumari");
		t5.setTrainName("KANNYAKUMARI Express");
		t5.setTrainFare(245.00);
		t5.setNumberOfSeats(150);
		t5.setOperatingDays(345);
		
		TrainTimeTable.setTrainList(t1);
		TrainTimeTable.setTrainList(t4);
		TrainTimeTable.setTrainList(t3);
		
		
	}
	

	public static TrainManagement getTrainAdmin() {
		if(tadmin == null){
			synchronized (TrainManagement.class){
				if(tadmin == null){
					tadmin = new TrainManagement();
				}
			}
		}
		return tadmin;		
	}
}
