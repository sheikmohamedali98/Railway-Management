
public class PaymentMain {
	/*
	 * pay  for the  fare 
	 * refund the money
	 */
  public  boolean dedutbalance(Train t,User user){
	  if(t.getTrainFare()<user.debitcoin){
		  user.debitcoin -= t.getTrainFare();
		  System.out.println("Your Balance is : "+user.debitcoin);
		  return true; 
		   
	  }
	  else{
		  System.out.println("Insufficient balance!!!!");
		  return false;
	  }
	  
  }
  public void refund(User user,Ticket t){
	  System.out.println("Refund Amount "+t.getFare()+" is will be credited with in Second");
	  user.debitcoin += t.getFare();
  }

}
