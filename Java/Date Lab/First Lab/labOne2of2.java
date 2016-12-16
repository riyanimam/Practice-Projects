import java.util.Scanner;

public class labOne2of2 {

	public static void main(String[] args) {

	    Scanner length = new Scanner(System.in);
	    System.out.println("How long do you want the list to be? ");
	    int r = length.nextInt();
	    int numbers[] = new int[r];
	    
	    System.out.println("Enter " + numbers.length + " number(s): ");

	    for(int i = 0; i < r; i++)
	    {
	        numbers[i] = length.nextInt();
	    }
	    
	    System.out.println("The minimum gap is: " + minGap(numbers));
	}
		public static int minGap(int[] number)
		{
			if(number.length < 2)
			{
				return 0;
			}
			
			int min = Math.abs(number[1] - number[0]);
			for(int j = 2; j < number.length; j++)
			{
				int nextMin = Math.abs(number[j] - number[j-1]); 
				
				if(min > nextMin) 
				{           
			         min = nextMin;
				}
			}
			return min;
		}
}