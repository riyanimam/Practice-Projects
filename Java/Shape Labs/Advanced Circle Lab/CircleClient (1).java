import java.util.ArrayList;
import java.util.Collections;

public class CircleClient {

	public static void main(String[] args) {

		ArrayList<Circle> list1 = new ArrayList<Circle>();
		
		Point p1 = new Point(12,15);
		Circle c1 = new Circle(p1,7);
		list1.add(c1);
		
		Point p2 = new Point(5,7);
		Circle c2 = new Circle(p2,3);
		list1.add(c2);
		
		Point p3 = new Point(5,7);
		Circle c3 = new Circle(p3,2);
		list1.add(c3);
		
		Point p4 = new Point(8,11);
		Circle c4 = new Circle(p4,5);
		list1.add(c4);
		
		Collections.sort(list1);
		
		System.out.println(list1);
	}

}
