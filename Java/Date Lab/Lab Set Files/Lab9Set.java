
public class Lab9Set {
	
	public static int sequentialSearch(int[] a, int b) {
		
		for(int i = 0; i < a.length; i++) 
		{
			if(b == a[i])
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int a, int[] b) {
		
		int first = 0;
		int last = b.length - 1;
		
		while(first <= last)
		{
			int mid = (first+last) / 2;
			for(int i = 0; i < b.length; i++)
			{
				if(b[mid] == a)
				{
					return mid;
				}
				else if(a < b[mid])
				{
					last = b[mid] - 1;
				}
				else
				{
					first = b[mid] + 1;
				}
			}
		}
		return -1;
	}
	
	public static int reBinary(int a, int first, int last, int[] set) {
		
		if(first < last) 
		{
			int mid = first + (last - first) / 2;
			if(a < set[mid])
			{
				return reBinary(a, first, mid, set);
			}
			else if(a > set[mid])
			{
				return reBinary(a, mid + 1, last, set);
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] test = {1,2,3,4,5};
		
		System.out.println(sequentialSearch(test, 4));
		System.out.println(sequentialSearch(test, 6));
		System.out.println(sequentialSearch(test, 1));
		
		System.out.println(binarySearch(5, test));
		System.out.println(binarySearch(6, test));
		System.out.println(binarySearch(3, test));
		
		System.out.println(reBinary(3, 1, 5, test));
		System.out.println(reBinary(6, 1, 5, test));
		System.out.println(reBinary(2, 1, 5, test));
	}
}
