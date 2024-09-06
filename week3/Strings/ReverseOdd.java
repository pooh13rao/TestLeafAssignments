package assignments.week3.Strings;

import java.util.Arrays;

public class ReverseOdd {

	public static void main(String[] args) {
		String test = "I am a software tester";
		// Split the string into words
		String[] input = test.split(" ");
		System.out.println("input is " + Arrays.toString(input));

		// Traverse through the words
		for (int i = 0; i < input.length; i++) {
			if (i % 2 != 0) {
				// Reverse the word at odd index using String Builder as this has pre defined
				// method reverse()
				StringBuilder newString = new StringBuilder(input[i]);
				//System.out.println(" before reverse  " + input[i]);

				input[i] = newString.reverse().toString();
				//System.out.println(" after reverse  " + input[i]);

			}
			System.out.print(" " + input[i]);
		}
	}

}
