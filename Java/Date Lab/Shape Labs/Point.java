
public class Point {

	private int xp;
	private int yp;
	
	public Point(int xp, int yp) {
		
		this.xp = xp;
		this.yp = yp;
		
	}
	
	public String toString() {
		
		return xp + "," + yp;
		
	}
	
	public static double distance(Point a, Point b) {
		
		return Math.sqrt((a.xp - b.xp)*(a.xp - b.xp) + (a.yp - b.yp)*(a.yp - b.yp));
		
	}
}
