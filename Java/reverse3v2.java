import java.util.*;

public class reverse3v2 {
	
	
	public static void reverse3(ArrayList<Integer> nums) {
		
		if(nums.size() > 2)
			if(nums.size() % 3 == 0)
				for(int i = 0; i < nums.size() - 1; i=i+3)
					Collections.swap(nums, i, i+2);
			if(nums.size() % 3 == 1)
				for(int i = 0; i < nums.size() - 2; i=i+3)
					Collections.swap(nums, i, i+2);
			if(nums.size() % 3 == 2)
				for(int i = 0; i < nums.size() - 3; i=i+3)
					Collections.swap(nums, i, i+2);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(6);
		list.add(9);
		list.add(8);
		list.add(4);
		list.add(0);
		list.add(18);
		list.add(3);
		list.add(5);
		
		System.out.println("Regular List: " + list);
		
		reverse3(list);
		
		System.out.println("Reversed In 3s List: " + list);
	}
}
