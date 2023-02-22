import java.sql.Array;
import java.util.ArrayList;

public class Library {
    //declared variables
    private ArrayList<Book> books;
    private Integer capacity;

    //constructor function (Define constructor?)
    public Library(Integer capacity) {
        //constructors (Define constructors?)
        this.capacity = capacity;
        //how do I construct an array?
        this.books = new ArrayList<>();
    }

    public int getAmountOfBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(checkSpaceForBook()) {
            this.books.add(book);
        }
    }

    public int getStockLevel() {
        return this.books.size();
    }


    public Boolean checkSpaceForBook(){
        if(getStockLevel() < capacity){
            return true;
        } else {
            return false;
        }
    }

}
