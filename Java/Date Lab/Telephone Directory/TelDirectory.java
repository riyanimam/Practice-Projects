
public class TelDirectory implements Comparable<TelDirectory>{
	
	private String name;
	private String number;
	
	public TelDirectory(String name, String number) {
		
		this.name = name;
		this.number = number;
		
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getNum() {
		
		return number;
		
	}
	
	public String toString() {
		
		return "(" + name + ", " + number + ")";
	}
	
	public int compareTo(TelDirectory p) {
		
		
		if(name == p.name)
			return number.compareTo(p.getNum());
		else
			return name.compareTo(p.getName());
	}

}
