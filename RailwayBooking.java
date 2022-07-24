import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class RailwayBooking {
  /*
   * LinkedList Collection to show  
   * this  method is Controller
   */
	static Queue<String> displayQ = new LinkedList<>();
	public static void main(String[] args) throws Exception{
		
		//TrainAdmin td =  TrainAdmin.getTrainAdmin();
		UserManagement um = new UserManagement();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			displayQ.clear();
			displayQ.add("1.User Management");
//			displayQ.add("2.Admin Management");
			displayQ.add("2.Exit");
			display(displayQ.size(),displayQ);
			/*get input from the user to choose
			 * if 1 goto user management
			 * else break
			 */
			int firstchoice = Integer.parseInt(br.readLine());
			
			if(firstchoice == 1){
				um.display(br);
			}
			
			else{
				break;
			}
			
		}
	}
	
	//display the collections have 
	static void display(int choice,Queue<String> displayQ){
		System.out.println(" -----------------------------------------------");
		
		for(int i=1;i<=choice;i++){
			System.out.println(i+")"+displayQ.peek());
			displayQ.remove();
		}
		System.out.println("Enter the choice:");

	}
}
