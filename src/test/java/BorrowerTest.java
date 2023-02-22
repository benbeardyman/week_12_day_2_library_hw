import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Norse Myths", "Kevin Crossley-Holland", "Mythology");
        library = new Library();
    }

    @Test
    public void has_collection(){
        assertEquals(0, borrower.getCollectionTotal())
;    }

    @Test
    public void can_add_book_to_collection(){
        borrower.addBook(book);
        assertEquals(1, borrower.getCollectionTotal());
    }

    @Test
    public void can_withdraw_book(){
        String searchBookTitle = "Concrete Island";
        borrower.withdrawBook(searchBookTitle, library);
        assertEquals(1, borrower.getCollectionTotal());
        assertEquals( 2, library.getCollectionTotal());
    }

}
