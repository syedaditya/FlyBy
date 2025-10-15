package customer;

import java.util.Scanner;

 public class Seat {
	// TODO Auto-generated constructor stub
		final int k = 300;
		int mySeat;
		static Pricing pri = new Pricing();
		Booking b1 = new Booking();
		static Seat b2 = new Seat();
		
		private Scanner myObj;
		public int availableSeat() {
			myObj = new Scanner(System.in);
				System.out.println("Number seats to book: ");
				 mySeat = myObj.nextInt();
				if(mySeat<= k) {
					
					System.out.println(mySeat+" Seats are booked for you");
					System.out.println("Thanks For Using Our Service");
				}
				else {
					System.out.println("Invalid");
				}
				return mySeat;
			} 
		}		
		
	
