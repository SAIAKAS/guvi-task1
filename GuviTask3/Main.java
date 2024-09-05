package GuviTask3;


	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Library library = new Library();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\nLibrary System Menu:");
	            System.out.println("1. Add Book");
	            System.out.println("2. Remove Book");
	            System.out.println("3. Search Book by ID");
	            System.out.println("4. Display Books");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Book ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine(); 
	                    System.out.print("Enter Book Title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter Author: ");
	                    String author = scanner.nextLine();
	                    System.out.print("Is Available (true/false): ");
	                    boolean isAvailable = scanner.nextBoolean();
	                    Book book = new Book(id, title, author, isAvailable);
	                    library.addBook(book);
	                    break;

	                case 2:
	                    System.out.print("Enter Book ID to remove: ");
	                    int bookIDToRemove = scanner.nextInt();
	                    library.removeBook(bookIDToRemove);
	                    break;

	                case 3:
	                    System.out.print("Enter Book ID to search: ");
	                    int bookIDToSearch = scanner.nextInt();
	                    Book foundBook = library.searchBookByID(bookIDToSearch);
	                    if (foundBook != null) {
	                        System.out.println(foundBook.toString());
	                    } else {
	                        System.out.println("Book not found.");
	                    }
	                    break;

	                case 4:
	                    library.displayBooks();
	                    break;

	                case 5:
	                    System.out.println("Exiting the library system.");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);

	        scanner.close();
	    }
	}

