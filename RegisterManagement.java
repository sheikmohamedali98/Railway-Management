import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * New User  Management 
 *  Random Credit coins
 *  Random debit coin
 * 
 */
public class RegisterManagement {
	void newUser(UserManagement us) throws Exception{
		
		System.out.println("If your are new Register !!!!");
		System.out.println("\t Enter Your Details given Below  ");
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		
		//N number of user will come so while in infinite loop
		while(true){
			System.out.println("Enter the UserName or Mail Id");
			String username = br.readLine();
			/*
			 * if username is already exist in map  
			 */
			if(us.users.containsKey(username)){
				System.out.println(" UserName Alredy Exsit! please try Again..");
				System.out.println("Thank you");
				
			}
			System.out.println("Enter the Password :");
			String password = br.readLine();
			User user = new User();//store user class 
			user.username = username;
			user.password = password;
			user.creditcoin = user.generateRandom(500,2000);
			user.debitcoin = user.generateRandom(100,1000);
			us.users.put(username, user);//add details in map
			break;
		}
	}

}
