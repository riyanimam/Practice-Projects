import java.util.Arrays;

public class HomeworkSet5 {
	
	public static int[] reverseSelection(int[] a) {
		
		for(int i = a.length - 1; i > 0; i--)
		{
			int place = i;
			for(int j = 0; j <= i; j++)
				if(a[j] > a[place])
				{
					place = j;
				}
			int bigNum = a[place];
			a[place] = a[i];
			a[i] = bigNum; 
		}
		return a;
	}
	
	public static int[] dualSelection(int[] a) {
		
		int i = 0;
	    while(i <= (a.length - i - 1)) 
	    {
	      int minIndex = i;
	      int maxIndex = a.length - i - 1; 
	      for(int j = i + 1; j <= a.length - i - 1; j++) 
	      {
	    	  if (a[j] <= a[minIndex]) 
	    	  {
	    		  minIndex = j;      
	    	  } 
	    	  if(a[j] >=a [maxIndex])
	    	  {
	    		  maxIndex = j; 
	    	  }
	      }
	      
	      int place = a[i];
	      a[i] = a[minIndex];
	      a[minIndex] = place;
	      
	      if(i == maxIndex) 
	      {
	           maxIndex = minIndex;
	      }
	      
	      int place2 = a[(a.length - i - 1)];
	      a[(a.length - i - 1)] = a[maxIndex];
	      a[maxIndex] = place2;
	    i++;
	    }
		return a;
	}

	public static void main(String[] args) {
		
		int[] test = {6, 3, 4, 10, 65, 48, 24, 26, 84};
		
		System.out.println(Arrays.toString(reverseSelection(test)));
		
		System.out.println();
		
		int[] test1 = {65, 45, 20, 78, 12, 18, 68, 79, 99, 14};
		
		System.out.println(Arrays.toString(dualSelection(test1)));
		

	}

}
