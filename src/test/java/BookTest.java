import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Norse Myths", "Kevin Crossley-Holland", "Mythology");
    }

    @Test
    public void book_has_title(){
        assertEquals("Norse Myths", book.getTitle());
    }

    @Test
    public void book_has_author(){
        assertEquals("Kevin Crossley-Holland", book.getAuthor());
    }

    @Test
    public void book_has_genre(){
        assertEquals("Mythology", book.getGenre());
    }

}
