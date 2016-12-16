import java.util.ArrayList;
import java.util.Collections;

public class TestDate {

	public static void main(String[] args) {
		ArrayList<Date> dates = new ArrayList<Date>();
		
		dates.add(new Date(4,13,1743));
		dates.add(new Date(2,22,1732));
		dates.add(new Date(3,16,1751));
		dates.add(new Date(10,30,1735));
		dates.add(new Date(4,28,1758));
		
		System.out.println("Regular Birthdays = " + dates);
		
		Collections.sort(dates);
		
		System.out.println("Sorted Birthdays = " + dates);
	}

}
