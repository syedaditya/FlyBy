package customer;
import java.util.*;

public class UserInfo {
	String name;
	String UserId;
	private Scanner myObj;
	private Scanner myObj2;
	public  UserInfo(){
	}
	public void info() {
		 myObj = new Scanner(System.in);
		 System.out.println("Enter name: ");
		  name = myObj.nextLine();
			 myObj2 = new Scanner(System.in);
			 System.out.println("Enter User Id: ");
			  UserId = myObj2.nextLine();
		System.out.println("Customer name: "+ name);
		System.out.println("Customer User Id: "+ UserId);
	}
	
	
	

}
