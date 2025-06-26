package Task_3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // Book management methods
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    // User management methods
    public void addUser(User user) {
        users.add(user);
    }

    public User findUserById(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    // Transaction methods
    public boolean issueBook(String userId, String isbn) {
        User user = findUserById(userId);
        Book book = findBookByIsbn(isbn);

        if (user != null && book != null && book.isAvailable()) {
            user.borrowBook(book);
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    public boolean returnBook(String userId, String isbn) {
        User user = findUserById(userId);
        Book book = findBookByIsbn(isbn);

        if (user != null && book != null && !book.isAvailable() &&
                user.getBorrowedBooks().contains(book)) {
            user.returnBook(book);
            book.setAvailable(true);
            return true;
        }
        return false;
    }

    // Display methods
    public void displayAllBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayAllUsers() {
        System.out.println("\nLibrary Users:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
