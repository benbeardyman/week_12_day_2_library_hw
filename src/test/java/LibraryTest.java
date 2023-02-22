import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before(){
        library = new Library(4);
        book1 = new Book("Norse Myths", "Kevin Crossley-Holland", "Mythology");
        book2 = new Book("American Gods", "Neil Gaiman", "Fantasy");
        book3 = new Book("Concrete Island", "J.G. Ballard", "Dystopian");
        book4 = new Book("Vernon God Little", "DBC Pierre", "Black Comedy");
    }

    @Test
    public void library_has_collection(){
        assertEquals(0, library.getCollectionTotal());
    }

    @Test
    public void can_add_book_to_library(){
        library.addBook(book1);
        assertEquals(1, library.getCollectionTotal());
    }

    @Test
    public void library_full(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(4, library.getCollectionTotal());
    }

    @Test
    public void library_has_capacity(){
        assertEquals(4, library.getCapacity());
    }


    @Test
    public void find_book_by_title(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        String searchBookTitle = "Concrete Island";
        Book foundBook = library.checkStock(searchBookTitle);
        assertEquals("Concrete Island", foundBook.getTitle());
    }

    @Test
    public void can_remove_book(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        String searchBookTitle = "Concrete Island";
        library.removeBook(library.checkStock(searchBookTitle));
        assertEquals(3, library.getCollectionTotal());
    }

}
