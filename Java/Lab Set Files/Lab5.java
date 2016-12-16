import java.util.ArrayList;

public class Lab5 {
	
	public static void filterRange(ArrayList<Integer> test1, int range1, int range2){
        
		for(int i = 0; i < test1.size(); i++)
        {
            if(test1.get(i) >= range1 && test1.get(i) <= range2)
            {
                test1.remove(i);
                i--;
            }

        }
        
		for(int i = 0; i < test1.size(); i++)
        {
            System.out.print(test1.get(i) + " ");
        }
        
		System.out.println();

    }
	
    public static void minToFront(ArrayList<Integer> test1){
    	
        int atIndex = test1.get(0);
        int index = 0;
        
        for(int i = 0; i < test1.size(); i++)
        {
            if(test1.get(i) < atIndex)
            {
                atIndex = test1.get(i);
                index = i;

            }
        }
        
        test1.remove(index);
        test1.add(0,atIndex);
        
        for(int i = 0; i < test1.size(); i++)
        {
            System.out.print(test1.get(i) + " ");
        }
        
        System.out.println();

    }
    
    public static void intersect(ArrayList <Integer> test1, ArrayList <Integer> test2){
        
    	ArrayList<Integer> test3 = new ArrayList<Integer>();

        for(int i = 0; i < test2.size(); i++)
        {
        	for (int j = 0; j < test1.size(); j++)
        	{
                if(test1.get(j) == test2.get(i))
                {
                    test3.add(test2.get(i));
                }

            }
        }
        for(int i = 0; i < test3.size(); i++)
        {
            System.out.print(test3.get(i) + " ");
        }
        System.out.println();

    }
	
	public static void main(String[] args) {
		
		ArrayList<Integer> tester1 = new ArrayList <Integer>();
		
        tester1.add(4);
        tester1.add(7);
        tester1.add(9);
        tester1.add(2);
        tester1.add(7);
        tester1.add(7);
        tester1.add(5);
        tester1.add(3);
        tester1.add(5);
        tester1.add(1);
        tester1.add(7);
        tester1.add(8);
        tester1.add(6);
        tester1.add(7);
        
        minToFront(tester1);

        filterRange(tester1, 5, 7);
        
        ArrayList<Integer> tester2 = new ArrayList <Integer>();
        ArrayList<Integer> tester3 = new ArrayList <Integer>();

        tester2.add(4);
        tester2.add(7);
        tester2.add(11);
        tester2.add(17);
        tester2.add(19);
        tester2.add(20);
        tester2.add(23);
        tester2.add(28);
        tester2.add(37);
        tester2.add(59);
        tester2.add(81);

        tester3.add(1);
        tester3.add(4);
        tester3.add(8);
        tester3.add(9);
        tester3.add(11);
        tester3.add(15);
        tester3.add(17);
        tester3.add(28);
        tester3.add(41);
        tester3.add(59);

        intersect(tester2, tester3);
	}

}
