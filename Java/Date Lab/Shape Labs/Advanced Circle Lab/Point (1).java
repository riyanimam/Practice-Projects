
public class Point {

	private static int x;
	private static int y;
	
	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public void setX(int x) {
		
		this.x = x;
		
	}
	
	public void setY(int y) {
		
		this.y = y;
		
	}
	
	public static int getX() {
		
		return x;
		
	}
	
	public static int getY() {
		
		return y;
		
	}
	
	public String toString() {
		
		return x + "," + y;
		
	}
}
