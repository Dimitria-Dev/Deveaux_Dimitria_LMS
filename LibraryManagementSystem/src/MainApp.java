/*
 * Dimitria Deveaux
 * CEN 3024 - Software Development I
 * May 19th,2024
 * MainApp.java
 *  This application will ask the user to select an option of what task they would like to perform.
 *  Based on their selection it will return the updated list of books in the Library Management System.
 */

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Library Management System");
        Library library = new Library();

        while (true) {
            System.out.println("Select an option: \n1. Add a Book from a file\n2. Add a Book manually\n3. Remove a Book\n4. Show Book List\n5. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter file name: ");
                    String fileName = scanner.nextLine();
                    library.addBooksFromFile(fileName);
                    System.out.println("Books added successfully!");
                    library.printBookList();
                    break;
                case 2:
                    System.out.println("Enter the book ID number: ");
                    int iD = scanner.nextInt();
                    System.out.println("Enter the book title: ");
                    String title = scanner.next();
                    System.out.println("Enter the book author: ");
                    String author = scanner.next();
                    Book manualBookEntry = new Book(iD, title, author);
                    library.addBook(manualBookEntry);
                    library.printBookList();
                    break;
                case 3:
                    System.out.println("Enter the book ID number you would like to remove: ");
                    int bookID = scanner.nextInt();
                    library.removeBook(bookID);
                    System.out.println("Book removed successfully!");
                    library.printBookList();
                    break;
                case 4:
                    System.out.println("Here is the list of books");
                    library.printBookList();
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }
}
