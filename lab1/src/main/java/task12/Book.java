package task12;

import java.util.Objects;

public class Book implements Cloneable, Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }
    static {
        edition = 1;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPrice(){
        return this.price;
    }
    public static int getEdition(){
        return edition;
    }
    private String getIsbn(){
        return this.isbn;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        if (!book.getTitle().equals(getTitle())) return false;
        if (!book.getAuthor().equals(getAuthor())) return false;
        if (book.getPrice() != getPrice()) return false;
        return true;
    }
    @Override
    public int hashCode() {
        return Objects.hash(title,author,price,edition);
    }
    @Override
    public String toString(){
        return "Book{" + "title='" + title + "', author='" + author + "', price=" + price + ", edition=" + edition + "}";
    }
    @Override
    public Object clone(){
        Object book = new Book(this.title, this.author, this.price, this.isbn);
        return book;
    }
    @Override
    public int compareTo(Book book){
        return this.isbn.compareTo(book.getIsbn());
    }
}
