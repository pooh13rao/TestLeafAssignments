package assignments.week3.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class missingNum {

	public static void main(String[] args) {

		int[] arr =  {1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(arr);
		// System.out.println("Sorted Array Is:");
		for (int num : arr) {
			System.out.println(num);
		}
		List<Integer> missingNo = new ArrayList<>();
		for (int i = 0; i < arr.length - 1; i++) {
			//check the current element + 1 is not equal to the next element
			if (arr[i] + 1 != arr[i + 1]) {
				missingNo.add(arr[i] + 1);
			}
		}
		System.out.println(missingNo);

	}
}
