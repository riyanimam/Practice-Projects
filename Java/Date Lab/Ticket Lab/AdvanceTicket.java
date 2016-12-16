
public class AdvanceTicket extends Ticket {
	
	private int days;
	
	public AdvanceTicket(int number, int days) {
		
		super(number);
		
		this.days = days;
		
	}
	
	public int getDays() {
		
		return days;
		
	}
	
	public double getPrice() {
		
		if(days > 10)
			return 30.0;
		else
			return 40.0;
		
	}
}
