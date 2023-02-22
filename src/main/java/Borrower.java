import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }


    public int getCollectionTotal() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public void withdrawBook(String searchBookTitle, Library library) {
        if (library.findBook(searchBookTitle) != null) {
            this.addBook(library.findBook(searchBookTitle));
            library.removeBook(library.findBook(searchBookTitle));
        }
    }

}
