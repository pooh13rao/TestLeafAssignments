package assignments.week3.Lists;

import java.util.ArrayList;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {

		int arr1[] = { 3, 2, 11, 4, 6, 7 };
		int arr2[] = { 1, 2, 8, 4, 9, 7 };
		 List<Integer> list = new ArrayList<>();
		for (int i = 0; i< arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
                    //	Add array elements to a list
                    if (!list.contains(arr1[i])) {
                    	list.add(arr1[i]);
                    }
                    break; 
				}
			}
		}
		 // Print the intersection
        System.out.println("List Intersection: " + list);
	}

}
