package process;
import customer.Booking;
import customer.Seat;
import customer.UserInfo;
import customer.SeatType;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInfo u1 = new UserInfo();
		Booking f1 = new Booking();
		Seat f2 = new Seat();
		SeatType f4 = new SeatType();

		u1.info();
		f1.Reserve();
		f4.Type();
		f2.availableSeat();
		
		
		
		
	}

}
