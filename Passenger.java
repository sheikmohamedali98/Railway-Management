import java.util.LinkedList;


public class Passenger {
	String Name;
	String Gender;
	int age;
	String Breath;
	//LinkedList passenger;
	/*
	 * get passenger details add in linked list
	 */
	
public String getName(){
	return Name;
}

protected void setName(String Name){
	this.Name = Name;
}

public String getGender(){
	return Gender.toLowerCase();
}

protected void setGender(String Gender){
	this.Gender = Gender;
}

public int getAge(){
	return age;
}

protected void setAge(int age){
	this.age = age;
}
public String getBreath(){
	return Breath;
}

protected void SetBreath(String Breath){
	this.Breath = Breath;
}

}
