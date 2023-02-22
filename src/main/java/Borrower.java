import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }


    public int getCollectionTotal() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public void withdrawBook(String searchBookTitle, Library library) {
        if (library.checkStock(searchBookTitle) != null) {
            this.addBook(library.checkStock(searchBookTitle));
            library.removeBook(library.checkStock(searchBookTitle));
        }
    }


}
