import java.util.Arrays;

public class Lab10Set {
	
	public static int[] selectionSort(int[] a) {
		
		for(int i = 0; i < a.length - 1; i++)
		{
			int place = i;
			for(int j = i + 1; j < a.length; j++)
				if(a[j] < a[place])
				{
					place = j;
				}
			int smallNum = a[place];
			a[place] = a[i];
			a[i] = smallNum; 
		}
		return a;
	}
	
	public static int[] bubbleSort(int[] b) {
		
		int temp;
		for(int i = 0; i < b.length-1; i++)
		{
			for(int j = 1; j < b.length-i; j++)
			{
				if(b[j-1] > b[j])
				{
					temp = b[j-1];
					b[j-1] = b[j];
					b[j] = temp;
				}
			}
		}
		return b;
	}

	public static int[] insertionSort(int[] c) {
		
		int temp;
        for (int i = 1; i < c.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(c[j] < c[j-1]){
                    temp = c[j];
                    c[j] = c[j-1];
                    c[j-1] = temp;
                }
            }
        }
        return c;
    }
	
	public static void main(String[] args) {

		int[] test = {6, 3, 4, 10, 65, 48, 24, 26, 84};
		
		System.out.println("Before Sort: " + Arrays.toString(test));
		//System.out.println("After Sort: " + Arrays.toString(selectionSort(test)));
		
		System.out.println();
		
		int[] test1 = {65, 45, 20, 78, 12, 18, 68, 79, 99, 14};
		
		System.out.println("Before Sort: " + Arrays.toString(test1));
		//System.out.println("After Sort: " + Arrays.toString(bubbleSort(test1)));
		
		System.out.println();
		
		int[] test2 = {35, 12, 65, 48, 21, 3, 78, 49, 47, 37};
		System.out.println("Before Sort: " + Arrays.toString(test2));
		System.out.println("After Sort: " + Arrays.toString(insertionSort(test2)));
	}

}
