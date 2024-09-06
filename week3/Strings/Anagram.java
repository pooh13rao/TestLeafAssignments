package assignments.week3.Strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";

		//  Check if the lengths of the two strings are equal:
		if (text1.length() != text2.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			return; 
		}

		// Convert both the strings to character arrays
		char[] arr1 = text1.toCharArray();
		char[] arr2 = text2.toCharArray();

		// Sort both the character arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		//  Check if the sorted arrays are equal
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("The given strings " + text1 +" & "+text2+" are Anagram.");
		} else {
			System.out.println("The given strings " + text1 +" & "+text2+" are not Anagram.");
		}
	}
}

