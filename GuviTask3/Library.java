package GuviTask3;

import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(int bookID) {
        Book book = searchBookByID(bookID);
        if (book != null) {
            books.remove(book);
            System.out.println("Book removed: " + book.getTitle());
        } else {
            System.out.println("Book with ID " + bookID + " not found.");
        }
    }

    public Book searchBookByID(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
    }
}

