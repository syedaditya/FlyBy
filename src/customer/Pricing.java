package customer;
public class Pricing extends Seat{
	
	int buis = 899;
	int eco = 499;
	static Pricing p1 = new Pricing();
	static SeatType st1 = new SeatType();
	
	public void price() {
		int a = b2.availableSeat();
		int b = st1.Type();
		int c = 0;
		if(b==1) {
			c = p1.buis * a;
			System.out.println("Total price is:"+c);
		}
		else if(b==2) {
			c = p1.eco * a;
			System.out.println("Total price is:"+c);
		}
		
	}
		
	}

