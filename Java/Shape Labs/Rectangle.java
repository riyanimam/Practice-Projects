
public class Rectangle {
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	private boolean modified = false;
	
	public Rectangle(int x, int y, int w, int h) {
		
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}

	
	public int getX() {
		
		return x;
		
	}
	
	public int getY() {
		
		return y;
		
	}
	
	public int getWidth() {
		
		return width;
		
	}
	
	public int getHeight() {
		
		return height;
		
	}
	
	public int area() {
		
		return width*height;
		
	}
	
	public void changeSize(int newWidth, int newHeight) {
		
		width = newWidth;
		height = newHeight;
		
		modified = true;
	}
	
	public String toString() {
		
		if(modified == true)
			return "Coordinate is (" + x + "," + y + ") and dimension is " + width + "x" + height +
					"\nArea after the size is changed is " + area();
		else
			return "Coordinate is (" + x + "," + y + ") and dimension is " + width + "x" + height +
					"\nArea is " + area();
		
	}
}