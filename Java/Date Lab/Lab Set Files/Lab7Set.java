
public class Lab7Set {
	
	
	public static void printN(int n) {
		
		if(n > 1)
			printN(n-1);
			System.out.println(n);
		
	}
	
	public static int fact(int f) {
		
		if(f == 1)
			return 1;
		else
			return f * fact(f-1);
		
	}
	
	public static int fib(int r) {
		
		if(r == 0)
			return 0;
		else if(r == 1)
			return 1;
		else
			return fib(r-1) + fib(r-2);
		
	}

	public static void main(String[] args) {
		
		printN(10);
		System.out.println("Factorial: " + fact(5));
		System.out.println("Fibonacci: " + fib(4));
		System.out.println("Fibonacci: " + fib(10));
	}

}
