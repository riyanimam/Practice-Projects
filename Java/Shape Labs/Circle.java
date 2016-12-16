
public class Circle {

	private int radius;
	public Point center;
	
	
	public Circle(Point center, int radius) {
		
		this.radius = radius;
		this.center = center;
		
	}
	
	public Point getCenter() {
		
		return center;
		
	}
	
	public int getRadius() {
		
		return radius;
		
	}
	
	public double getArea() {
		
		return (Math.PI * radius * radius);
		
	}
	
	public double getCircumference() {
		
		return (2 * Math.PI * radius);
		
	}
	
	public String toString() {
		
		return "Circle[center=(" + center + "), radius=" + radius + "]";
		
	}
	
	public boolean contains(Point p) {
		
		if(Point.distance(center, p) <= radius)
			
			return true;
		
		else
			
			return false;
		
	}
	
}
