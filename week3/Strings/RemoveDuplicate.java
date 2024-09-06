package assignments.week3.Strings;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String input = "We learn Java basics as part of java sessions in java week1";
		processDuplicates(input);
	}

	public static void processDuplicates(String input) {
		// Initialize the count of duplicate words
		int count = 0;

		// Split the input string into words
		String[] words = input.split(" ");
// to copy the unique words 
		String[] modifiedWords = new String[words.length];
		// Loop through each word
		for (int i = 0; i < words.length; i++) {
			// Skip if the current word is already replaced
			System.out.println("Word i " +words[i] );
			if (words[i].isEmpty())
				continue;
			// Check for duplicates
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equalsIgnoreCase(words[j])) {
					System.out.println("duplicate words are " + words[i] + " & " + words[j]);
					// Replace the duplicate word with an empty string
					words[j] = "";
					count++;
				}
			}
		}

		//  if any duplicates are there 
		if (count > 1) {
			// Print the modified array where duplicates have been replaced with empty strings
			System.out.print("Modified words array: ");
			for (int i = 0; i < words.length; i++) {
				// Print only non-empty words
				if (!words[i].isEmpty()) {
					System.out.print(words[i] + " ");
				}
			}
			System.out.println();

		} else {
			System.out.println("No duplicates found.");
		}
	}
}
