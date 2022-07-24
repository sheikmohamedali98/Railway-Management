import java.io.BufferedReader;
import java.io.InputStreamReader;

//single resposibilty principle
public class LoginManagement {
	void login(UserManagement us )throws Exception{
		System.out.println("-------User Login--------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * username password checking
		 * forget  password
		 */
		
		while(true){
			System.out.println("enter the UserName : ");
			String username = br.readLine();
			System.out.println("Enter the Password : ");
			String password = br.readLine();
			/*
			 * check username contain same password
			 */
			if(us.users.containsKey(username)){
				if(us.users.get(username).password.equals(password)){
					@SuppressWarnings("unused")
					BookingManagement bm = new BookingManagement();
					while(true){
						User LoggedInUser = us.getUsers().get(username);
						int val = LoggedInUser.bookingmanagement.booking(LoggedInUser);
						if(val == 1){
							return;
						}
					}
					
				}
				System.out.println("Your UserName and Password is in correct");
				
			}
			
		}
	}

}
