
public class Homework4 {
	
	public static int multiply(int a, int b) {
		
		if(a == 0 || b == 0)
			return 0;
		else if (a == 1)
			return b;
		else if (b == 1)
			return a;
		else
			return multiply(a-1, b) + b;
		
	}
	
	public static void writeSequence(int n) {
		
	    if(n == 1) 
	    {
	        System.out.print("1");
	    } 
	    else if(n == 2) 
	    {
	    	System.out.print("1 1");
	    } 
	    else if(n % 2 == 0) 
	    {
	    	System.out.print((n / 2) + " ");
	        writeSequence(n - 2);
	        System.out.print(" " + (n / 2));
	    } 
	    else if(n % 2 == 1) 
	    {
	        System.out.print(((n + 1) / 2) + " ");
	        writeSequence((n - 2));
	        System.out.print(" " + ((n + 1) / 2));
	    }       
	}

	public static void main(String[] args) {
		
		System.out.println(multiply(3,9));
		writeSequence(10);

	}

}
