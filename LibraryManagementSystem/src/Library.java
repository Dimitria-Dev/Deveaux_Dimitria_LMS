/*
 * Dimitria Deveaux
 * CEN 3024 - Software Development I
 * May 19th,2024
 * Library.java
 *  This class creates a library object and performs the following: adding books to lms, removing books from the lms,
 *  and printing books that are in the lms.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList;

    public Library(){
        bookList = new ArrayList<>();
    }

    /* method: addBook
     * parameter: Book
     * return: none
     * purpose: to add data to the list
     * */
    public void addBook(Book book){
        bookList.add(book);
    }

    /* method: addBooksFromFile
     * parameter: String filename
     * return: none
     * purpose: to read the user file upload and add the books to the LMS
     * */
    public void addBooksFromFile(String filename) {
        try {
            File file = new File(System.getProperty("user.home") + "/Desktop/" + filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fileDetails = line.split(",");
                if (fileDetails.length == 3) {
                    addBook(new Book(Integer.parseInt(fileDetails[0].trim()), fileDetails[1].trim(), fileDetails[2].trim()));
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }

    /* method: removeBook
     * parameter: int bookID
     * return: none
     * purpose: to remove a book from the list
     * */
    public void removeBook(int bookID){
        bookList.remove(bookID);
    }

    /* method: printBookList
     * parameter: none
     * return: none
     * purpose: to print the current list of books in the LMS
     * */
    public void printBookList(){
        for(Book book : bookList){
            System.out.println(book);
        }
    }
}
