package assignments.week3.Lists;

import java.util.ArrayList;
import java.util.List;

public class largestNumber {

	public static void main(String[] args) {
		int numList[] = { 3, 2, 11, 4, 6, 7};
		 List<Integer> list = new ArrayList<>();
	        for (int num : numList) {
	            list.add(num);
	        }
	      //  Arrange the collection in ascending order
	        list.sort(null);
	        System.out.println("sorted order -- "+list);
	        System.out.println("Length of the List --- " +list.size());
	        //Finding 2nd largest number from the sorted list
	        int secondLargeNum = list.get(list.size() - 2);
	        System.out.println("Second largest Number is :" +secondLargeNum);
	        
	}
	

}
