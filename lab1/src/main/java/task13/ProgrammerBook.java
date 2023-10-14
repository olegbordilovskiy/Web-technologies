package task13;

import task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;
    public ProgrammerBook(String title, String author, int price, String isbn, String language, int level){
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }
    public String getLanguage(){
        return this.language;
    }
    public int getLevel(){
        return this.level;
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        ProgrammerBook book = (ProgrammerBook) obj;
        if (!language.equals(book.getLanguage())) return false;
        if (level != book.getLevel()) return false;
        return true;
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(),language,level);
    }
    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "title='" + getTitle() +
                "', author='" + getAuthor() +
                "', price=" + getPrice() +
                ", edition=" + getEdition() + // Если edition нужно включить, унаследованный метод
                ", language='" + language  +
                "', level=" + level +
                '}';
    }
}
