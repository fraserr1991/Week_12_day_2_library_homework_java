import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

        private Library library;
        private Book book;
        private Book book2;

        private Book book3;
        private Book book4;

        @Before
        public void before() {
            //create a function which setups instances of books in library
            book = new Book("Harry Potter","JK Rowling","female");
            book2 = new Book("Dispicable", "Dr Drae", "male");
            book3 = new Book("1984", "George Orwell", "male");
            book4 = new Book("Rocky", "Silvesta Stallon", "male");
            library = new Library(3);
        }

        @Test
        public void canAddBook() {
                library.addBook(book);
//                library.addBook(book2);
//                library.addBook(book3);
//                library.addBook(book4);
                assertEquals(1, library.getAmountOfBooks());
                assertEquals(Book.class, book.getClass());
        }

        @Test
        public void canCheckStockLevel() {
            library.addBook(book);
            assertEquals(1, library.getStockLevel());
        }

        @Test
        public void canHaveCapacity() {
            library.addBook(book);
            library.addBook(book2);
            library.addBook(book3);
            library.addBook(book4);
            assertEquals(3, library.getStockLevel());
    }

}

//import org.junit.Before;
//        import org.junit.Test;
//
//        import static org.junit.Assert.assertEquals;
//
//public class RiverTest {
//
//        private River river;
//        private Salmon salmon;
//
//        @Before
//        public void before(){
//                river = new River();
//                salmon = new Salmon();
//        }
//
//        @Test
//        public void canAddSalmon(){
//                river.addFish(salmon);
//                assertEquals(1, river.fishCount());
//        }

