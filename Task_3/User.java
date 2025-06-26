package Task_3;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String userId;
    private List<Book> borrowedBooks;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Methods to manage borrowed books
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "User [Name: " + name + ", ID: " + userId +
                ", Borrowed Books: " + borrowedBooks.size() + "]";
    }
}