
public class Lab4Client {

	public static void main(String[] args) {
		
		Employee alice = new Employee(150.0, 27, "ASE", "New York", 834827, 5);
		Teacher bob = new Teacher(179.0, 35, "Associate Professor", 4, "Programming");
		
		
		System.out.println(alice.getAge() + ", " + alice.getId() + ", " + alice.getYear() + ", " + alice.getAge());
		System.out.println(bob.getSubject() + ", " + bob.getDesignation() + ", " + bob.getWeight() + ", " + bob.getSalary());
		
		//Human h1 = bob;
		//System.out.println(h1.getSalary());
		//Gives an error; Human cannot reach getSalary.
		
		//Profession p1 = alice;
		//System.out.println(p1.getDesignation());
		//Returns ASE.
		
		//System.out.println(h1.getWeight());
		//Returns 157.0
	}

}
