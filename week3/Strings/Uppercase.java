package assignments.week3.Strings;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "changeme";

		// Convert the given String to a character array.
		char[] arr = text.toCharArray();

		for (int i = arr.length - 1; i >= 0; i--) {
			if (i % 2 != 0) {
				// change the character to uppercase if the index is odd
				arr[i] = Character.toUpperCase(arr[i]);
				System.out.println(arr[i]);
			}
		}
		//character to String convert
		String newString = new String(arr);
		System.out.println("The changed String is "+newString);

	}

}
