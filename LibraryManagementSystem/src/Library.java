/* Dimitra Deveaux | Software Development I | May 19th,2024
 *  Library class: --brief explanation of this class as it relates to the overall program
 * */

import java.util.ArrayList;
import java.util.List;

public class Library <T>{
    //attribute
    private List<T> bookList;

    //constructor
    public Library(){
        bookList = new ArrayList<>();
    }

    //method to add data to the bookList
    public void add(T book){
        bookList.add(book);
    }

    //method to remove a book from the list
    public void remove(T book){
        bookList.remove(book);
    }

    //toString method to return book list
    @Override
    public String toString(){
        return "Books:" + bookList;
    }

    public void printBookList(){
        for(T book : bookList){
            System.out.println(book);
        }
    }
}
