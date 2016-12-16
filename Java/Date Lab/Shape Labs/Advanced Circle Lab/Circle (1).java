
public class Circle implements Comparable<Circle> {

	private int radius;
	public Point center;
	
	
	public Circle(Point center, int radius) {
		
		this.radius = radius;
		this.center = center;
		
	}
	
	public void setPoint(Point center) {
		
		this.center = center;
		
	}
	
	public void setRadius(int radius) {
		
		this.radius = radius;
		
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
	
	public int compareTo(Circle other) {
		
		if(this.getArea() == other.getArea())
		{
			if(Point.getX() == other.center.getX())
			{
				if(Point.getY() == other.center.getY()) 
				{
					return 0;
				}
				else if(Point.getY() > other.center.getY())
				{
					return 1;
				}
				else
				{
					return -1;
				}
			}
			else if(Point.getX() > other.center.getX())
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
		else if(this.getArea() > other.getArea())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	public String toString() {
		
		return "Circle[center=(" + center + "), radius=" + radius + "]";
		
	}
}
