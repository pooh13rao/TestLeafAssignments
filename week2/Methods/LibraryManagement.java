package assignments.week2.Methods;

public class LibraryManagement {

	public static void main(String[] args) {

		Library Books = new Library();
		String BookName = Books.addBook("Harry Potter part-2");
		
		System.out.println("The Name of Book added is - " +BookName);
		
		Books.issueBook();
	}

}
