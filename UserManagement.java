import java.io.BufferedReader;
import java.util.HashMap;

/*
 * managening the user details
 * display the option
 */
public class UserManagement {
	HashMap<String,User> users;
	 
	
	public UserManagement(){
		users = new HashMap<>();
		User user = new User();
		user.username = "sheik";
		user.password = "sheik";
		users.put("sheik", user);
		
	}

	public HashMap<String,User> getUsers(){
		 return users;
	}
	 public void setUsers(String username,User user){
		 users.put(username,user);
	 }
	 void display(BufferedReader br)throws Exception{
		 while(true){
			 RailwayBooking.displayQ.clear();
			 RailwayBooking.displayQ.add("New User");
			 RailwayBooking.displayQ.add("Existing user");
			 RailwayBooking.displayQ.add("Return To Main Menu");
			 RailwayBooking.display(RailwayBooking.displayQ.size(),RailwayBooking.displayQ);
			 
		 int secondchoice = Integer.parseInt(br.readLine());
			 
			 if(secondchoice == 1){
				 RegisterManagement rm = new RegisterManagement();
				 rm.newUser(this);
				 
			 }
			 else if(secondchoice ==2){
				 LoginManagement  lm = new LoginManagement();
				 lm.login(this);
			 }
		 }
		 
	 
	 }
	
}
