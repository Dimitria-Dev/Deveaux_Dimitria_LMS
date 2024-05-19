/*
 * Dimitria Deveaux
 * CEN 3024 - Software Development I
 * May 19th,2024
 * Book.java
 *  This class creates a book object that sets the book ID, title and author.
*/

public class Book {
    private int bookID;
    private String author;
    private String title;

    public Book(int bookID, String author, String title) {
        this.bookID = bookID;
        this.author = author;
        this.title = title;
    }

    public int getBookID() {
        return bookID;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    /* Method: ToString
    * parameter: none
    * return: String
    * purpose: to display the book information
    * */
    @Override
    public String toString() {
        return bookID + ", " + title + ", " + author;
    }
}
