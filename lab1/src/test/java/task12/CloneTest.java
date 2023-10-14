package task12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CloneTest {
    @Test
    void cloneTest(){
        Book book = new Book("All Quiet on the Western Front", "Erich Maria Remarque",15," 9783462045819");
        Book cloned = (Book)book.clone();
        Assertions.assertEquals(book,cloned);
    }
}
