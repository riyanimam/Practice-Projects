import java.util.*;

public class TelDirectoryClient {

	public static void main(String[] args) {
		
		ArrayList<TelDirectory> list1 = new ArrayList<TelDirectory>();
		
		TelDirectory tom = new TelDirectory("Tom Hill", "444-654-6540");
		list1.add(tom);
		
		TelDirectory jack = new TelDirectory("Jack Band", "444-165-6540");
		list1.add(jack);
		
		TelDirectory tim = new TelDirectory("Tim Hask", "514-654-6540");
		list1.add(tim);
		
		TelDirectory rob = new TelDirectory("Rob Son", "444-654-9187");
		list1.add(rob);
		
		TelDirectory thomas = new TelDirectory("Thomas Hill", "548-541-6540");
		list1.add(thomas);

		TelDirectory rave = new TelDirectory("Rave Ben", "444-654-1250");
		list1.add(rave);
		
		TelDirectory celine = new TelDirectory("Celine Don", "444-987-6540");
		list1.add(celine);
		
		TelDirectory james = new TelDirectory("James Rogain", "987-654-6540");
		list1.add(james);
		
		TelDirectory ray = new TelDirectory("Ray Elder", "444-917-6540");
		list1.add(ray);
		
		TelDirectory kim = new TelDirectory("Kim Shed", "444-754-6540");
		list1.add(kim);
		
		Collections.sort(list1);
		
		System.out.println(list1);

	}

}
