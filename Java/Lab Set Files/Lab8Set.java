
public class Lab8Set {
	
	public static void writeSquares(int n) {
		
		if (n % 2 == 0) 
		{ 
			writeSquares(n-1); 
			System.out.print(", " + n*n); 
		} 
		else 
		{
			System.out.print(n*n); 
			if (n > 1) 
			{ 
				System.out.print( ", " ); 
				writeSquares(n-1); 
			} 
		} 

	}
	
	public static int seqSearch(int[] arr, int n)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == n)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		 
		writeSquares(9);
		System.out.println();
		writeSquares(1);
		System.out.println();
		writeSquares(8);
		System.out.println();
		writeSquares(4);
		
		System.out.println();
		System.out.println();
		
		int[] test = {1,2,3,4,5};

		System.out.println(seqSearch(test, 5));
		System.out.println(seqSearch(test, 3));
		System.out.println(seqSearch(test, 6));
	}

}
