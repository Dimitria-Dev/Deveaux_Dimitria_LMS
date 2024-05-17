/* Dimitra Deveaux | Software Development I | May 19th,2024
*  Book class: --brief explanation of this class as it relates to the overall program
* */

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

    /* ToString method to display the book information */
    @Override
    public String toString() {
        return bookID + ". " + title + " " + author;
    }
}
