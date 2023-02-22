import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Norse Myths", "Kevin Crossley-Holland", "Mythology");
    }

    @Test
    public void library_has_collection(){
        assertEquals(3, library.getCollectionTotal());
    }

    @Test
    public void can_add_book_to_library(){
        library.addBook(book);
        assertEquals(4, library.getCollectionTotal());
    }

    @Test
    public void library_full(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(4, library.getCollectionTotal());
    }

    @Test
    public void library_has_capacity(){
        assertEquals(4, library.getCapacity());
    }


    @Test
    public void find_book_by_title(){
        String searchBookTitle = "Concrete Island";
        Book foundBook = library.findBook(searchBookTitle);
        assertEquals("Concrete Island", foundBook.getTitle());
    }

    @Test
    public void can_remove_book(){
        String searchBookTitle = "Concrete Island";
        library.removeBook(library.findBook(searchBookTitle));
        assertEquals(2, library.getCollectionTotal());
    }

}
