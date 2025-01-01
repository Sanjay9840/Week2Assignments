package week2.day1HomeAssignments;



public class Library {
	
	//Created a Library Class
	
	
	public String addBook(String bookTitle) {
		// created addBook method with string return type
		
		System.out.println("Book added successfully"); //once method called printing the "Book added successfully"
		return bookTitle; //Return the bookTitle
		
	}
	
	public void issueBook() {
		// Created issueBook method with return type void
		
		System.out.println("Book issued successfully"); //once method called printing the "Book issued successfully"

	}

	
	public static void main(String[] args) {
		
		Library lb = new Library(); //Created the object to call the methods
		
		System.out.println("Book Title: "+ lb.addBook("Who will cry when you die?")); 
		//called the addBook method and printed the "Book added successfully" and returned value BookTitle.
		
		lb.issueBook();
		//called the issueBook method and printed the "Book issued successfully".
		
	}
}
