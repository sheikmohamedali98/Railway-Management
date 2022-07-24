import java.util.HashMap;


public class TrainTimeTable {
  static final HashMap<Integer,Train> trainList;
  
  static{//if we creat object first excute this block
	  trainList = new HashMap<Integer,Train>();
  
  }
  
  
  public static  HashMap<Integer,Train> getTrainList(){
	  return trainList;
  }
  
  public static void setTrainList(Train train){
	  trainList.put(train.getTrainNumber(), train);
	  
  }
  
}
