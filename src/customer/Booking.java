package customer;
import java.util.Scanner;


public class Booking {
	
	private Scanner myObj;
	
	public int Reserve() {
		myObj = new Scanner(System.in);
			System.out.println("Enter date to book: ");
			int date = myObj.nextInt();

				
				if(date<=31) {
					
					System.out.println("Flight date is: "+ date);
				}
				else {
					System.out.println("Invalid Date");
				}
				return date;
				
			}

	
	
	
}
