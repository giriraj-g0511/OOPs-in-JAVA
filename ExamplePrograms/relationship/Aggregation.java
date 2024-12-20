package relationship;

/*
 * 
 * After deleting object of library the book object is still exist 
 * it is example of aggregation which shows loose bonding between two object
 * one object can exist another one but one can not exist another one
 * 	so one is dependent on another whether as another is not depend on any other
 * 		library depends on book object but book object not need of library object to be exist
 * 
 * */



class Library {
	int shelfNumber;
	Book book;
}

class Book {
	String name;
	String author;
}

public class Aggregation {

	public static void main(String[] args) {
		Library library = new Library();
		library.shelfNumber=1;
		library.book=new Book();
		library.book.name="Let us C";
		library.book.author="Yashwant Kanetkar";

		Book b=library.book;
		
		System.out.println("Library object is present");
		System.out.println(library+" is Library object reference");
		System.out.println("Book name :"+library.book.name);
		System.out.println("Book author :"+library.book.author);
		System.out.println("Library shelfNumber :"+library.shelfNumber);
		System.out.println();
		library=null;
		
		System.out.println("Library object is null");
		System.out.println(library+" is Library object reference");

		// it will give null pointer exception because we try to access variables using null variable
//		System.out.println("Book name :"+library.book.name);
//		System.out.println("Book author :"+library.book.author);
//		System.out.println("Library shelfNumber :"+library.shelfNumber);
		
		System.out.println();
		System.out.println(b+" is Book object reference");
		System.out.println(b.name);
		System.out.println(b.author);
		
	}

}

 class TestAggregation {
    public static void main(String[] args) {
        Library library = new Library();
        library.shelfNumber = 12;

        Book book = new Book();
        book.name = "To Kill a Mockingbird";
        book.author = "Harper Lee";

        // Aggregation - Library has a Book, but the Book can exist without the Library
        library.book = book;

        System.out.println("Library: " + library.shelfNumber + " has a book titled " + library.book.name + " by " + library.book.author);
    }
}

