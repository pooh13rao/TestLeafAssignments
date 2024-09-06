package assignments.week3.Strings;

public class removeDuplicates {

	public static void main(String[] args) {
		// input
		String text = "We learn Java basics as part of java sessions in java week1";
		// Expected = We learn Java basics as part of sessions in week1
		// Initialize the count variable
		int count = 0;

		// Split the text into an array of words
		String[] words = text.split(" ");

		// nested for loop to compare each word with other words
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				// for comparing 'Java' & 'java'
				if (words[i].equalsIgnoreCase(words[j])) {
					// Replace the duplicate word with an empty string
					words[j] = "";
					// Increment the count
					count++;
				}
			}
		}

		// to check count is greater than 1, print the modified array
		if (count > 0) {
			for (String word : words) {
				if (!word.isEmpty()) {
					System.out.print(word + " ");
				}
			}
		}
	}

}
