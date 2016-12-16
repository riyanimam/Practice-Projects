
public class CircleClient {

	public static void main(String[] args) {

		Point p1 = new Point(10,5);
		Circle c1 = new Circle(p1,7);
		
		System.out.println(c1);
		
		System.out.println("Area: " + c1.getArea());
		System.out.println("Circumference: " + c1.getCircumference());
		
		Point p2 = new Point(5,7);
		
		if(c1.contains(p2 ))
			System.out.println("(" + p2 + ") lies within the circle");
		else
			System.out.println("(" + p2 + ") does not lie within the circle");
		
		
		
	}

}
