
public class Profession extends Human {
	
	private String designation;
	
	public Profession(double weight, int age, String designation){
		
		super(weight, age);
		this.designation = designation;
		
	}
	
	public String getDesignation(){
		
		return designation;
		
	}	
}
