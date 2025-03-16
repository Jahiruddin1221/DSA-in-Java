package OOPs;

import java.lang.ref.PhantomReference;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String ISBM;

    private static ArrayList<Book> bookColluction = new ArrayList<>();

    public Book(String title, String ISBM, String author) {
        this.title = title;
        this.ISBM = ISBM;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBM() {
        return ISBM;
    }

    public void setISBM(String ISBM) {
        this.ISBM = ISBM;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Method
    public static void addBook(Book book) {
        bookColluction.add(book);
    }
    public static void removeBook(Book book) {
        bookColluction.remove(book);
    }

    public static ArrayList<Book> getBookColluction() {
        return bookColluction;
    }
    public void displayBook() {
//        System.out.println("Your book list");
        System.out.println("Title " + getTitle() + " ISBN " + getISBM() + " author " + getAuthor());
    }

    public static void main(String[] args) {
        Book book1 = new Book("math", "1000", "Raju");
        Book book2 = new Book("physic", "5000", "kk");

        System.out.println("Your book list");
        addBook(book1);
        addBook(book1);
        for (Book b1: bookColluction) {
            b1.displayBook();
        }
        removeBook(book1);
        System.out.println("Your book list");
        for (Book b1: bookColluction) {
            b1.displayBook();
        }
        System.out.println("Your book list");
        removeBook(book1);
        for (Book b1: bookColluction) {
            b1.displayBook();
        }
        addBook(book2);
        for (Book b2: bookColluction) {
            System.out.println("Your book list");
            b2.displayBook();
        }
    }
}
