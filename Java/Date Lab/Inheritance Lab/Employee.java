
public class Employee extends Profession{

	private String location;
	private int id;
	private int experience;
	
	public Employee(double weight, int age, String designation, String location, int id, int experience){
		
		super(weight, age, designation);
		
		this.location = location;
		this.id = id;
		this.experience = experience;
		
	}
	
	public String getLocation(){
		
		return location;
		
	}
	
	public int getId(){
		
		return id;
		
	}
	
	public String getYear(){
		
		if(experience < 2)
			return "Fresher";
		else if(experience >= 2 && experience < 4)
			return "Assistant Software Engineer";
		else if(experience >= 4 && experience < 6)
			return "Software Engineer";
		else 
			return "Team Lead";
	}
}
