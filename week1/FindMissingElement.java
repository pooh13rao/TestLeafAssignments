package assignments.week1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 3, 2, 8, 6, 7 };
		Arrays.sort(arr);
		System.out.println("Sorted Array Is:");
		for (int num : arr) {
			System.out.println(num);
		}
		for (int i = 0; i < arr.length-1; i++) {

			if (arr[i] + 1 != arr[i + 1]) {
				System.out.println("Missing Number Is: " + (arr[i] + 1));

			}

		}
	}
}
