package assignments.week2.Methods;

public class Library {

	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");	
		return bookTitle;
	}

		public void issueBook() {
			System.out.println("Book issued successfully");
			
		}
	public static void main(String[] args) throws InterruptedException {
			
			Library Books = new Library();
			String BookName = Books.addBook("Harry Potter part-1");		
			System.out.println("The Name of Book added is - " +BookName);	
			Books.issueBook();
		}
}
