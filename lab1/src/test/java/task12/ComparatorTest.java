package task12;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComparatorTest {
    @Test
    void testTitleComparator() {
        Book book1 = new Book("B", "Author1", 10, "123");
        Book book2 = new Book("A", "Author2", 20, "456");
        Book book3 = new Book("C", "Author3", 15, "789");

        List<Book> books = Arrays.asList(book1, book2, book3);
        books.sort(new TitleComparator());

        Book[] expectedOrder = {book2, book1, book3};
        assertArrayEquals(expectedOrder, books.toArray());
    }

    @Test
    void testTitleAuthorComparator() {
        Book book1 = new Book("B", "Author1", 10, "123");
        Book book2 = new Book("A", "Author2", 20, "456");
        Book book3 = new Book("A", "Author1", 15, "789");

        List<Book> books = Arrays.asList(book1, book2, book3);
        books.sort(new TitleAuthorComparator());

        Book[] expectedOrder = {book3, book2, book1};
        assertArrayEquals(expectedOrder, books.toArray());
    }

    @Test
    void testAuthorTitleComparator() {
        Book book1 = new Book("B", "Author1", 10, "123");
        Book book2 = new Book("A", "Author2", 20, "456");
        Book book3 = new Book("A", "Author1", 15, "789");

        List<Book> books = Arrays.asList(book1, book2, book3);
        books.sort(new AuthorTitleComparator());

        Book[] expectedOrder = {book3, book1, book2};
        assertArrayEquals(expectedOrder, books.toArray());
    }

    @Test
    void testAuthorTitlePriceComparator() {
        Book book1 = new Book("B", "Author1", 10, "123");
        Book book2 = new Book("A", "Author1", 20, "456");
        Book book3 = new Book("A", "Author1", 15, "789");

        List<Book> books = Arrays.asList(book1, book2, book3);
        books.sort(new AuthorTitlePriceComparator());

        Book[] expectedOrder = {book3, book2, book1};
        assertArrayEquals(expectedOrder, books.toArray());
    }
}
