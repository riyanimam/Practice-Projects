
public class BankAccount {

	private String name;
	private double balance;
	
	
	public BankAccount(){
		
		name = null;
		balance = 0.0;
		
	}
	
	
	public BankAccount(String n, double b){
		
		name = n;
		balance = b;
		
	}
	
	
	public String getName(){
		
		return name;
		
	}
	
	
	public double getDeposit(){
		
		return balance;
		
	}
	
	
	public void deposit(double amount){
		
		balance = balance + amount;
		
	}
	
	public void withdraw (double amount){
		
		balance = balance - amount;	
		
	}
		

	public String toString(){
		
		return name + ", $" + balance;
		
	}
	
	
	public static void main(String[] args) {
		
		BankAccount jakesBank = new BankAccount("Jake", 40.0);
		System.out.println(jakesBank);

	}

}
