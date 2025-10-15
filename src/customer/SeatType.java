package customer;
//import customer.Seat;

import java.util.Scanner;

//import customer.Booking;


public class SeatType extends Pricing {
	static SeatType s1 = new SeatType();
	private Scanner myObj;
	public int Type() {
		System.out.println("1)Buisness ");
		System.out.println("2)Economic ");
		 myObj = new Scanner(System.in);
		System.out.println("Enter seat type: ");
		int cls = myObj.nextInt();
	
		if(cls == 1) {
			System.out.println("Buisness per seat price is: "+p1.buis);
			
			
		}
		else if(cls == 2) {
			System.out.println("Economic per seat price is: "+p1.eco);
			
		}
		else {
			System.out.println("Invalid Choice");
		}
		return cls;
	}
	

}
