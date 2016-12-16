
public class Teacher extends Profession {

	private int years;
	private String subject;
	
	public Teacher(double weight, int age, String designation, int years, String subject){
		
		super(weight, age, designation);
		
		this.years = years;
		this.subject = subject;
		
	}
	
	public int getYears(){
		
		return years;
		
	}
	
	public String getSubject(){
		
		return subject;
		
	}
	
	public int getSalary(){
		
		return 45000 + (years * 6000);
		
	}
}