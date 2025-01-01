package week2.day1HomeAssignments;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library lm = new Library();
		
		System.out.println("Book Title: "+ lm.addBook("Designing Destiny"));
		//called the addBook method and printed the "Book added successfully" and returned value BookTitle.
		
		lm.issueBook();
		//called the issueBook method and printed the "Book issued successfully".
		
		

	}

}
