import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> collection;


    public Library(int capacity) {
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }


    public int getCollectionTotal() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (this.getCollectionTotal() < this.capacity) {
            this.collection.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public Book findBook(String searchBookTitle) {
        for (Book book : this.collection) {
            if (book.getTitle().equals(searchBookTitle)) {
                return book;
            }
        }
        return null;
    }

    public void removeBook(Book book) {
        this.collection.remove(book);
    }
}
