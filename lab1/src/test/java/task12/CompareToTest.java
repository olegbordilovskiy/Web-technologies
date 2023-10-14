package task12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompareToTest {
    @Test
    public void testCompareTo() {
        Book book1 = new Book("T1", "A1", 20, "9780333435670");
        Book book2 = new Book("T2", "A2", 25, "9780449213940");

        assertTrue(book1.compareTo(book2) < 0);
        assertTrue(book2.compareTo(book1) > 0);
        assertTrue(book1.compareTo(book1) == 0);
    }
}
