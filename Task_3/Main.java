package Task_3;

public class Main {
    public static void main(String[] args) {
        // Create library instance
        Library library = new Library();

        // Add some books
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));
        library.addBook(new Book("1984", "George Orwell", "9780451524935"));

        // Add some users
        library.addUser(new User("Alice Johnson", "U001"));
        library.addUser(new User("Bob Smith", "U002"));

        // Display initial state
        library.displayAllBooks();
        library.displayAllUsers();

        // Test book issuing
        System.out.println("\nIssuing books:");
        boolean issue1 = library.issueBook("U001", "9780743273565"); // Alice borrows Gatsby
        boolean issue2 = library.issueBook("U002", "9780061120084"); // Bob borrows Mockingbird
        boolean issue3 = library.issueBook("U001", "9780451524935"); // Alice borrows 1984

        System.out.println("Issue 1: " + (issue1 ? "Success" : "Failed"));
        System.out.println("Issue 2: " + (issue2 ? "Success" : "Failed"));
        System.out.println("Issue 3: " + (issue3 ? "Success" : "Failed"));

        // Display state after issuing
        library.displayAllBooks();
        library.displayAllUsers();

        // Test book returning
        System.out.println("\nReturning books:");
        boolean return1 = library.returnBook("U001", "9780743273565"); // Alice returns Gatsby
        boolean return2 = library.returnBook("U002", "9780061120084"); // Bob returns Mockingbird

        System.out.println("Return 1: " + (return1 ? "Success" : "Failed"));
        System.out.println("Return 2: " + (return2 ? "Success" : "Failed"));

        // Display final state
        library.displayAllBooks();
        library.displayAllUsers();
    }
}
