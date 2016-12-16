
public class StudentAdvanceTicket extends AdvanceTicket {
	
	public StudentAdvanceTicket(int number, int days) {
		
		super(number, days);
		
	}
	
	public double getPrice() {
			
			if(getDays() > 10)
				return 15.0;
			else
				return 20.0;
			
	}
	
	public String toString() {
		
		return "Number: " + getNumber() + ", Price: " + getPrice() + " (ID required)";
		
	}

}
