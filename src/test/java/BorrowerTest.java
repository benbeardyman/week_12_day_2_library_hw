import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Library library;

    @Before
    public void before(){
        borrower = new Borrower("Ben");
        book1 = new Book("Norse Myths", "Kevin Crossley-Holland", "Mythology");
        book2 = new Book("American Gods", "Neil Gaiman", "Fantasy");
        book3 = new Book("Concrete Island", "J.G. Ballard", "Dystopian");
        book4 = new Book("Vernon God Little", "DBC Pierre", "Black Comedy");
        library = new Library(4);
    }

    @Test
    public void has_collection(){
        assertEquals(0, borrower.getCollectionTotal())
;    }

    @Test
    public void can_add_book_to_collection(){
        borrower.addBook(book1);
        assertEquals(1, borrower.getCollectionTotal());
    }

    @Test
    public void can_withdraw_book(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        String searchBookTitle = "Concrete Island";
        borrower.withdrawBook(searchBookTitle, library);
        assertEquals(1, borrower.getCollectionTotal());
        assertEquals( 3, library.getCollectionTotal());
    }

}
